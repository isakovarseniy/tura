/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.uuiclient.rest.client.commands;

import java.util.HashMap;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessBean;

import org.tura.platform.datacontrol.CommandStackSupplier;
import org.tura.platform.datacontrol.annotations.StackSupplier;
import org.tura.platform.uuiclient.annotations.ElementByIdConverter;
import org.tura.platform.uuiclient.annotations.ElementByIdValidator;
import org.tura.platform.uuiclient.annotations.FatalError;
import org.tura.platform.uuiclient.annotations.FatalValidationError;
import org.tura.platform.uuiclient.annotations.FormContextRef;
import org.tura.platform.uuiclient.annotations.KeyTransformer;
import org.tura.platform.uuiclient.annotations.TypeConverter;
import org.tura.platform.uuiclient.annotations.TypeValidator;

@ApplicationScoped
public class LifeCycleRegistry  implements Extension{
	
    private HashMap<String, Bean<?>> elementValidator = new HashMap<>();
    private HashMap<String, Bean<?>> typeValidator = new HashMap<>();
    private HashMap<String, Bean<?>> fatalprocessor = new HashMap<>();
    private HashMap<String, Bean<?>> stackSupplier = new HashMap<>();
    private HashMap<String, Bean<?>> elementConverter = new HashMap<>();
    private HashMap<String, Bean<?>> keyConverter = new HashMap<>();
    private HashMap<String, Bean<?>> typeConverter = new HashMap<>();
    private HashMap<String, Bean<?>> contextRef = new HashMap<>();

    
    
    
    public <T> void collect(@Observes ProcessBean<T> event) {

        if (event.getAnnotated().isAnnotationPresent(ElementByIdValidator.class)) {
        	ElementByIdValidator annotetion = event.getAnnotated().getAnnotation(ElementByIdValidator.class);
        	elementValidator.put(annotetion.id(),event.getBean());
        }
        
        if (event.getAnnotated().isAnnotationPresent(TypeValidator.class)) {
        	TypeValidator annotetion = event.getAnnotated().getAnnotation(TypeValidator.class);
        	 typeValidator.put(annotetion.clazz().getName(),event.getBean());
        }
        
        if (event.getAnnotated().isAnnotationPresent(FatalValidationError.class)) {
        	fatalprocessor.put("FatalValidationError",event.getBean());
        }

        if (event.getAnnotated().isAnnotationPresent(FatalError.class)) {
        	fatalprocessor.put("FatalError",event.getBean());
       }
        
        if (event.getAnnotated().isAnnotationPresent(StackSupplier.class)) {
        	StackSupplier annotetion = event.getAnnotated().getAnnotation(StackSupplier.class);
        	stackSupplier.put(annotetion.value(),event.getBean());
        }
        
        if (event.getAnnotated().isAnnotationPresent(ElementByIdConverter.class)) {
        	ElementByIdValidator annotetion = event.getAnnotated().getAnnotation(ElementByIdValidator.class);
        	elementConverter.put(annotetion.id(),event.getBean());
        }
        
        if (event.getAnnotated().isAnnotationPresent(TypeConverter.class)) {
        	TypeConverter annotetion = event.getAnnotated().getAnnotation(TypeConverter.class);
        	 typeConverter.put(annotetion.clazz().getName(),event.getBean());
        }

        if (event.getAnnotated().isAnnotationPresent(KeyTransformer.class)) {
        	KeyTransformer annotetion = event.getAnnotated().getAnnotation(KeyTransformer.class);
        	keyConverter.put(annotetion.id(),event.getBean());
        }
        
        
        if (event.getAnnotated().isAnnotationPresent(FormContextRef.class)) {
        	FormContextRef annotetion = event.getAnnotated().getAnnotation(FormContextRef.class);
        	contextRef.put(annotetion.form(),event.getBean());
        }
        
    }
    
    
    public ContextRef findContextRef(String form) {
    	Bean<?> bean = contextRef.get(form);
    	if ( bean == null) {
    		return null;
    	}
    	return createContextRef(bean);

    }
    
    public Validator findValidatorByType(Class<?> clazz){
    	Bean<?> bean = typeValidator.get(clazz.getName());
    	if ( bean == null) {
    		return null;
    	}
    	
    	return createValidator(bean);
    }
    
    public Converter findConverterByIdElement(String  id){
    	Bean<?> bean = elementConverter.get(id);
    	if ( bean == null) {
    		return null;
    	}
    	return createConverter(bean);
    }
    
	public KeyConverter findKeyConverterById(String id) {
    	Bean<?> bean = keyConverter.get(id);
    	if ( bean == null) {
    		return null;
    	}
    	return createKeyConverter(bean);
	}
    
    
    public Converter findConverterByType(Class<?> clazz){
    	Bean<?> bean = typeConverter.get(clazz.getName());
    	if ( bean == null) {
    		return null;
    	}
    	
    	return createConverter(bean);
    }
    
    public Validator findValidatorByIdElement(String  id){
    	Bean<?> bean = elementValidator.get(id);
    	if ( bean == null) {
    		return null;
    	}
    	return createValidator(bean);
    }
    
    
    
    public ProgramSource getFatalValidationErrorProcessor() {
    	Bean<?> bean = fatalprocessor.get("FatalValidationError");
    	if ( bean == null) {
    		return null;
    	}
    	return createProgramSource(bean);
    }

    public ProgramSource getFatalErrorProcessor() {
    	Bean<?> bean = fatalprocessor.get("FatalError");
    	if ( bean == null) {
    		return null;
    	}
    	return createProgramSource(bean);
    }
    
    private ProgramSource createProgramSource( Bean<?> bean) {
		BeanManager bm = CDI.current().getBeanManager();
	   	
    	CreationalContext<?> ctx = bm.createCreationalContext(bean);
    	ProgramSource programSource = (ProgramSource) bm.getReference(bean, ProgramSource.class, ctx);   	

    	return programSource;
    		
    }
    
    private Validator createValidator( Bean<?> bean) {
		BeanManager bm = CDI.current().getBeanManager();
	   	
    	CreationalContext<?> ctx = bm.createCreationalContext(bean);
    	Validator validator = (Validator) bm.getReference(bean, Validator.class, ctx);   	

    	return validator;
    		
    }

    private Converter createConverter( Bean<?> bean) {
		BeanManager bm = CDI.current().getBeanManager();
	   	
    	CreationalContext<?> ctx = bm.createCreationalContext(bean);
    	Converter converter = (Converter) bm.getReference(bean, Converter.class, ctx);   	

    	return converter;
    		
    }
    
    private KeyConverter createKeyConverter( Bean<?> bean) {
		BeanManager bm = CDI.current().getBeanManager();
	   	
    	CreationalContext<?> ctx = bm.createCreationalContext(bean);
    	KeyConverter converter = (KeyConverter) bm.getReference(bean, KeyConverter.class, ctx);   	

    	return converter;
    		
    }
    
    
    private ContextRef createContextRef( Bean<?> bean) {
		BeanManager bm = CDI.current().getBeanManager();
	   	
    	CreationalContext<?> ctx = bm.createCreationalContext(bean);
    	ContextRef contextRef = (ContextRef) bm.getReference(bean, ContextRef.class, ctx);   	

    	return contextRef;
    		
    }
    
	public CommandStackSupplier getCommandStacks(String selector) {
    	Bean<?> bean = stackSupplier.get(selector);
    	if ( bean == null) {
    		return null;
    	}

    	BeanManager bm = CDI.current().getBeanManager();
	   	
    	CreationalContext<?> ctx = bm.createCreationalContext(bean);
    	CommandStackSupplier commandStackSupplier = (CommandStackSupplier) bm.getReference(bean, CommandStackSupplier.class, ctx);   	

    	return commandStackSupplier;
	}


    
}



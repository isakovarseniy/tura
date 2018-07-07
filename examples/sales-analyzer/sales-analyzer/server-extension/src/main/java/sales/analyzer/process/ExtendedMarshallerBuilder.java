package sales.analyzer.process;

import java.util.HashSet;
import java.util.Set;

import org.kie.server.api.marshalling.Marshaller;
import org.kie.server.api.marshalling.MarshallerBuilder;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.marshalling.jaxb.JaxbMarshaller;
import org.kie.server.api.marshalling.json.JSONMarshaller;
import org.kie.server.api.marshalling.xstream.XStreamMarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sales.analyzer.api.model.impl.SalesAnalyzerListOfProcessInstances;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;

public class ExtendedMarshallerBuilder implements MarshallerBuilder {

	private static final Logger logger = LoggerFactory.getLogger(ExtendedMarshallerBuilder.class);

	@Override
	public Marshaller build(Set<Class<?>> classes, MarshallingFormat format, ClassLoader classLoader) {

		HashSet<Class<?>> newList = new HashSet<Class<?>>();
		if (classes != null) {
			newList.addAll(classes);
		}
		newList.add(SalesAnalyzerListOfProcessInstances.class);
		newList.add(SalesAnalyzerProcessInstance.class);

		switch (format) {
		case XSTREAM:
			logger.debug("About to build default instance of XStream marshaller with classes {} and class loader {}",
					classes, classLoader);
			return new XStreamMarshaller(newList, classLoader);
		case JAXB:
			logger.debug("About to build default instance of JAXB marshaller with classes {} and class loader {}",
					classes, classLoader);
			return new JaxbMarshaller(newList, classLoader);
		case JSON:
			logger.debug("About to build default instance of JSON marshaller with classes {} and class loader {}",
					classes, classLoader);
			return new JSONMarshaller(newList, classLoader);
		default:
			logger.error("Unsupported marshalling format: " + format);
		}
		return null;
	}
}
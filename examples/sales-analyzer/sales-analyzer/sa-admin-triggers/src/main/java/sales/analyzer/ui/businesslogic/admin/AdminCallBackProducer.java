package sales.analyzer.ui.businesslogic.admin;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.primefaces.model.CallbackProducer;


@Alternative
@Priority(10)
@Selector("admin.administration")
public class AdminCallBackProducer implements Serializable, CallbackProducer{
    
    private static final long serialVersionUID = 3136401614144775869L;

    @Inject
    ELResolver elResolver;

    private Map<String,Object> map = new HashMap<>();
    
    public static String ROLE_SELECTION_TABLE = "tura"+"dce48561-8d19-475d-b3dd-fee6f5ce6ea1".replace("-", "_");
    
    public static String  PERMISSION_SELECTION_TABLE =  "tura"+"da7d6000-299d-4f95-a7e7-e9117ebfb94f".replace("-", "_");
    
    public static String   USER_SELECTION_TABLE =    "tura"+ "d8bdfe00-910f-4baa-9c1e-e203c4eeb2a6".replace("-", "_");
    
    @Override
    public Object getCallBackObject(String id) {
        return map.get(id);
    }

    
    @PostConstruct
    public void init() {
        map.put(ROLE_SELECTION_TABLE, new RoleSelectionGridTriggers(elResolver));
        map.put(PERMISSION_SELECTION_TABLE, new PermissionSelectionGridTrigger(elResolver));
        map.put(USER_SELECTION_TABLE, new UserSelectionGridTrigger(elResolver));
    }
    
    
}
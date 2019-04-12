package sales.analyzer.ui.businesslogic.admin;

import java.util.List;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.primefaces.model.GridModelTriggers;

public class UserSelectionGridTriggers implements GridModelTriggers{
    
    private ELResolver elResolver;

    public UserSelectionGridTriggers(ELResolver elResolver) {
        this.elResolver = elResolver;
    }

    @Override
    public void onSelect(Object obj) {
        System.out.println("onSelect");
        
    }

    @Override
    public void onUnselect(Object obj) {
        System.out.println("onSelect");
        
    }

    @Override
    public List<Object> initSeceted() {
        // TODO Auto-generated method stub
        return null;
    }

}
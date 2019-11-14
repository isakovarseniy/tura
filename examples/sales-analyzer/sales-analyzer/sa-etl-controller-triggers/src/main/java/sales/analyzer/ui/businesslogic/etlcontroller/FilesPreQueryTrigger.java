package sales.analyzer.ui.businesslogic.etlcontroller;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.PreQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.IBeanFactory;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.process.commons.Constants;



@Alternative
@Priority(10)
@Selector("dataloader.etlcontroller")
@PreQuery("fileEntry")

public class FilesPreQueryTrigger implements PreQueryTrigger{

    
    @Inject
    ELResolver elResolver;

    @Override
    public void execute(DataControl<?> datacontrol) throws TuraException {
        datacontrol.getDefaultSearchCriteria().clear();
        
        IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
        String fn = bf.getProcessingDate();

        SearchCriteria sc = new SearchCriteria();
        sc.setName(Constants.PARAMETER_FILE_TEMPLATE);
        sc.setValue("**/MonthlyData_"+fn+"*.csv");
        sc.setComparator(Operator.EQ.name());
        datacontrol.getDefaultSearchCriteria().add(sc);
    
    }

}
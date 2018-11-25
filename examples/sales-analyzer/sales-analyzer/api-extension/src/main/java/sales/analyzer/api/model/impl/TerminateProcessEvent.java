package sales.analyzer.api.model.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;

@XmlRootElement
@Remotable
public class TerminateProcessEvent implements Serializable{

	private static final long serialVersionUID = -1685912648088492546L;

}

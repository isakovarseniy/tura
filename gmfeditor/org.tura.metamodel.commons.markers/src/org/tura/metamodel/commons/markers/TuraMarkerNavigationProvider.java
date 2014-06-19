package org.tura.metamodel.commons.markers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.emf.ui.providers.marker.AbstractModelMarkerNavigationProvider;


public class TuraMarkerNavigationProvider extends AbstractModelMarkerNavigationProvider {

	public static void deleteMarkers(IResource resource, String markerType ) {
		try {
			resource.deleteMarkers(markerType, true, IResource.DEPTH_ZERO);
		} catch (CoreException e) {
			LogUtil.log("Failed to delete validation markers", e); 
		}
	}

	
	public static IMarker addMarker(IFile file, String elementId,
			String location, String message, int statusSeverity, String MarkerType) {
		IMarker marker = null;
		try {
			marker = file.createMarker( MarkerType);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.LOCATION, location);
			marker.setAttribute(
					org.eclipse.gmf.runtime.common.ui.resources.IMarker.ELEMENT_ID,
					elementId);
			int markerSeverity = IMarker.SEVERITY_INFO;
			if (statusSeverity == IStatus.WARNING) {
				markerSeverity = IMarker.SEVERITY_WARNING;
			} else if (statusSeverity == IStatus.ERROR
					|| statusSeverity == IStatus.CANCEL) {
				markerSeverity = IMarker.SEVERITY_ERROR;
			}
			marker.setAttribute(IMarker.SEVERITY, markerSeverity);
		} catch (CoreException e) {
			LogUtil.log("Failed to create validation marker", e); //$NON-NLS-1$
		}
		return marker;
	}
	
	
	@Override
	protected void doGotoMarker(IMarker marker) {
		// TODO Auto-generated method stub
		
	}

	
	
}

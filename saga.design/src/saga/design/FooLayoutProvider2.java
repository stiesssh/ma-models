package saga.design;

import java.util.List;
import java.util.Map;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.AbstractLayoutEditPartProvider;
import org.eclipse.sirius.diagram.ui.api.layout.CustomLayoutAlgorithm;
import org.eclipse.sirius.diagram.ui.api.layout.CustomLayoutAlgorithm.CustomLayoutAlgorithmBuilder;
import org.eclipse.sirius.diagram.ui.api.layout.CustomLayoutAlgorithmProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.ordering.ViewOrdering;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.AbstractLayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.CompoundLayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.DefaultLayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.GridLayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.LayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.LineLayoutProvider;


/**
 * Layout edit parts in line according to the {@link ViewOrdering} to use.
 * 
 * @author ymortier
 */
//public class FooLayoutProvider extends LineLayoutProvider implements LayoutProvider {
public class FooLayoutProvider2 implements CustomLayoutAlgorithmProvider {

	@Override
	public List<CustomLayoutAlgorithm> getCustomLayoutAlgorithms() {
		// TODO Auto-generated method stub
		CustomLayoutAlgorithmBuilder builder = CustomLayoutAlgorithm.newCustomLayoutAlgorithm("AlgoFromFoo2-id");
		builder.setDescription("AlgoFromFoo2-description");
		builder.setLabel("AlgoFromFoo2-label");
		builder.setLayoutSupplier(() -> new DefaultLayoutProvider());
		builder.setLayoutOptions(Map.of());
		
		
		
		
		return List.of(builder.build());
	}



}

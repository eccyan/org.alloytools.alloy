package org.alloytools.alloy.classic.provider;

import org.alloytools.alloy.module.api.AlloyModule;

import edu.mit.csail.sdg.parser.CompModule;

public interface AlloyModuleClassic extends AlloyModule {

	CompModule getOriginalModule();

}

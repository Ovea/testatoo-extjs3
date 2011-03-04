/**
 * Copyright (C) 2008 Ovea <dev@testatoo.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.testatoo.cartridge.extjs3.component;

import org.testatoo.cartridge.extjs3.ExtJSEvaluator;
import org.testatoo.core.ComponentException;
import org.testatoo.core.ComponentType;
import static org.testatoo.core.ComponentType.*;

public class Panel extends org.testatoo.core.component.Panel {

    public Panel(ExtJSEvaluator evaluator, String id) {
        super(evaluator, id);

        if (evaluator.componentType(id) != Panel)
            throw new ComponentException("The component with id=" + id + " is not a " + Panel + " but a " + evaluator.componentType(id));
    }
}

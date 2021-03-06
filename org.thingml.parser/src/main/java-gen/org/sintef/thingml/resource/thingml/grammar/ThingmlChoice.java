/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.sintef.thingml.resource.thingml.grammar;

public class ThingmlChoice extends org.sintef.thingml.resource.thingml.grammar.ThingmlSyntaxElement {
	
	public ThingmlChoice(org.sintef.thingml.resource.thingml.grammar.ThingmlCardinality cardinality, org.sintef.thingml.resource.thingml.grammar.ThingmlSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.sintef.thingml.resource.thingml.util.ThingmlStringUtil.explode(getChildren(), "|");
	}
	
}

/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 */
package org.sintef.thingml;


import org.sintef.thingml.cep.CepStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.sintef.thingml.ThingmlPackage#getStream()
 * @model abstract="true"
 * @generated
 */
public interface Stream extends Event {
    /**
     * MODIFICATION
     * @author ludovic
     * @generated NOT
     */
    CepStream getCepStream();

    /**
     * MODIFICATION
     * @author ludovic
     * @generated NOT
     */
    void setCepStream(CepStream cepStream);

} // Stream

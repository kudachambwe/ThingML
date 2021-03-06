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
/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.LengthWindow#getSize <em>Size</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LengthWindow#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getLengthWindow()
 * @model
 * @generated
 */
public interface LengthWindow extends ViewSource
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(Expression)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLengthWindow_Size()
   * @model containment="true"
   * @generated
   */
  Expression getSize();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LengthWindow#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Expression value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(Expression)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLengthWindow_Step()
   * @model containment="true"
   * @generated
   */
  Expression getStep();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LengthWindow#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(Expression value);

} // LengthWindow

/**
 * *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.xtext.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.LocalVariable#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LocalVariable#getName <em>Name</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LocalVariable#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LocalVariable#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getLocalVariable()
 * @model
 * @generated
 */
public interface LocalVariable extends AnnotatedElement, Action, Variable
{
  /**
   * Returns the value of the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Changeable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Changeable</em>' attribute.
   * @see #setChangeable(boolean)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLocalVariable_Changeable()
   * @model
   * @generated
   */
  boolean isChangeable();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LocalVariable#isChangeable <em>Changeable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Changeable</em>' attribute.
   * @see #isChangeable()
   * @generated
   */
  void setChangeable(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLocalVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LocalVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' containment reference.
   * @see #setTypeRef(TypeRef)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLocalVariable_TypeRef()
   * @model containment="true"
   * @generated
   */
  TypeRef getTypeRef();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LocalVariable#getTypeRef <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' containment reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(TypeRef value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Expression)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLocalVariable_Init()
   * @model containment="true"
   * @generated
   */
  Expression getInit();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LocalVariable#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Expression value);

} // LocalVariable

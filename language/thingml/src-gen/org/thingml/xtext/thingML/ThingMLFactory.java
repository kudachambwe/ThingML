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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLPackage
 * @generated
 */
public interface ThingMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ThingMLFactory eINSTANCE = org.thingml.xtext.thingML.impl.ThingMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  ThingMLModel createThingMLModel();

  /**
   * Returns a new object of class '<em>Platform Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Platform Annotation</em>'.
   * @generated
   */
  PlatformAnnotation createPlatformAnnotation();

  /**
   * Returns a new object of class '<em>Annotated Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotated Element</em>'.
   * @generated
   */
  AnnotatedElement createAnnotatedElement();

  /**
   * Returns a new object of class '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Ref</em>'.
   * @generated
   */
  TypeRef createTypeRef();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Type</em>'.
   * @generated
   */
  PrimitiveType createPrimitiveType();

  /**
   * Returns a new object of class '<em>Object Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Type</em>'.
   * @generated
   */
  ObjectType createObjectType();

  /**
   * Returns a new object of class '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration</em>'.
   * @generated
   */
  Enumeration createEnumeration();

  /**
   * Returns a new object of class '<em>Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Literal</em>'.
   * @generated
   */
  EnumerationLiteral createEnumerationLiteral();

  /**
   * Returns a new object of class '<em>Thing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Thing</em>'.
   * @generated
   */
  Thing createThing();

  /**
   * Returns a new object of class '<em>Property Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Assign</em>'.
   * @generated
   */
  PropertyAssign createPropertyAssign();

  /**
   * Returns a new object of class '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol</em>'.
   * @generated
   */
  Protocol createProtocol();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message</em>'.
   * @generated
   */
  Message createMessage();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>Required Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Port</em>'.
   * @generated
   */
  RequiredPort createRequiredPort();

  /**
   * Returns a new object of class '<em>Provided Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provided Port</em>'.
   * @generated
   */
  ProvidedPort createProvidedPort();

  /**
   * Returns a new object of class '<em>Internal Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Port</em>'.
   * @generated
   */
  InternalPort createInternalPort();

  /**
   * Returns a new object of class '<em>Region</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Region</em>'.
   * @generated
   */
  Region createRegion();

  /**
   * Returns a new object of class '<em>Region Or Session</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Region Or Session</em>'.
   * @generated
   */
  RegionOrSession createRegionOrSession();

  /**
   * Returns a new object of class '<em>Composite State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite State</em>'.
   * @generated
   */
  CompositeState createCompositeState();

  /**
   * Returns a new object of class '<em>Final State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Final State</em>'.
   * @generated
   */
  FinalState createFinalState();

  /**
   * Returns a new object of class '<em>Session</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Session</em>'.
   * @generated
   */
  Session createSession();

  /**
   * Returns a new object of class '<em>Parallel Region</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parallel Region</em>'.
   * @generated
   */
  ParallelRegion createParallelRegion();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Handler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Handler</em>'.
   * @generated
   */
  Handler createHandler();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Internal Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Transition</em>'.
   * @generated
   */
  InternalTransition createInternalTransition();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Receive Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Receive Message</em>'.
   * @generated
   */
  ReceiveMessage createReceiveMessage();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Action Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Block</em>'.
   * @generated
   */
  ActionBlock createActionBlock();

  /**
   * Returns a new object of class '<em>Extern Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extern Statement</em>'.
   * @generated
   */
  ExternStatement createExternStatement();

  /**
   * Returns a new object of class '<em>Local Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Variable</em>'.
   * @generated
   */
  LocalVariable createLocalVariable();

  /**
   * Returns a new object of class '<em>Send Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Send Action</em>'.
   * @generated
   */
  SendAction createSendAction();

  /**
   * Returns a new object of class '<em>Variable Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Assignment</em>'.
   * @generated
   */
  VariableAssignment createVariableAssignment();

  /**
   * Returns a new object of class '<em>Increment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Increment</em>'.
   * @generated
   */
  Increment createIncrement();

  /**
   * Returns a new object of class '<em>Decrement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decrement</em>'.
   * @generated
   */
  Decrement createDecrement();

  /**
   * Returns a new object of class '<em>Loop Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Action</em>'.
   * @generated
   */
  LoopAction createLoopAction();

  /**
   * Returns a new object of class '<em>Conditional Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Action</em>'.
   * @generated
   */
  ConditionalAction createConditionalAction();

  /**
   * Returns a new object of class '<em>Return Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Action</em>'.
   * @generated
   */
  ReturnAction createReturnAction();

  /**
   * Returns a new object of class '<em>Print Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Print Action</em>'.
   * @generated
   */
  PrintAction createPrintAction();

  /**
   * Returns a new object of class '<em>Error Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error Action</em>'.
   * @generated
   */
  ErrorAction createErrorAction();

  /**
   * Returns a new object of class '<em>Start Session</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Session</em>'.
   * @generated
   */
  StartSession createStartSession();

  /**
   * Returns a new object of class '<em>Function Call Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call Statement</em>'.
   * @generated
   */
  FunctionCallStatement createFunctionCallStatement();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Extern Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extern Expression</em>'.
   * @generated
   */
  ExternExpression createExternExpression();

  /**
   * Returns a new object of class '<em>Enum Literal Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Literal Ref</em>'.
   * @generated
   */
  EnumLiteralRef createEnumLiteralRef();

  /**
   * Returns a new object of class '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal</em>'.
   * @generated
   */
  IntegerLiteral createIntegerLiteral();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Double Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Literal</em>'.
   * @generated
   */
  DoubleLiteral createDoubleLiteral();

  /**
   * Returns a new object of class '<em>Property Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Reference</em>'.
   * @generated
   */
  PropertyReference createPropertyReference();

  /**
   * Returns a new object of class '<em>Event Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Reference</em>'.
   * @generated
   */
  EventReference createEventReference();

  /**
   * Returns a new object of class '<em>Function Call Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call Expression</em>'.
   * @generated
   */
  FunctionCallExpression createFunctionCallExpression();

  /**
   * Returns a new object of class '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration</em>'.
   * @generated
   */
  Configuration createConfiguration();

  /**
   * Returns a new object of class '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance</em>'.
   * @generated
   */
  Instance createInstance();

  /**
   * Returns a new object of class '<em>Config Property Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Property Assign</em>'.
   * @generated
   */
  ConfigPropertyAssign createConfigPropertyAssign();

  /**
   * Returns a new object of class '<em>Abstract Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Connector</em>'.
   * @generated
   */
  AbstractConnector createAbstractConnector();

  /**
   * Returns a new object of class '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector</em>'.
   * @generated
   */
  Connector createConnector();

  /**
   * Returns a new object of class '<em>External Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Connector</em>'.
   * @generated
   */
  ExternalConnector createExternalConnector();

  /**
   * Returns a new object of class '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression</em>'.
   * @generated
   */
  OrExpression createOrExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

  /**
   * Returns a new object of class '<em>Equals Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equals Expression</em>'.
   * @generated
   */
  EqualsExpression createEqualsExpression();

  /**
   * Returns a new object of class '<em>Not Equals Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Equals Expression</em>'.
   * @generated
   */
  NotEqualsExpression createNotEqualsExpression();

  /**
   * Returns a new object of class '<em>Greater Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greater Expression</em>'.
   * @generated
   */
  GreaterExpression createGreaterExpression();

  /**
   * Returns a new object of class '<em>Lower Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lower Expression</em>'.
   * @generated
   */
  LowerExpression createLowerExpression();

  /**
   * Returns a new object of class '<em>Greater Or Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greater Or Equal Expression</em>'.
   * @generated
   */
  GreaterOrEqualExpression createGreaterOrEqualExpression();

  /**
   * Returns a new object of class '<em>Lower Or Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lower Or Equal Expression</em>'.
   * @generated
   */
  LowerOrEqualExpression createLowerOrEqualExpression();

  /**
   * Returns a new object of class '<em>Plus Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Expression</em>'.
   * @generated
   */
  PlusExpression createPlusExpression();

  /**
   * Returns a new object of class '<em>Minus Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus Expression</em>'.
   * @generated
   */
  MinusExpression createMinusExpression();

  /**
   * Returns a new object of class '<em>Times Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Times Expression</em>'.
   * @generated
   */
  TimesExpression createTimesExpression();

  /**
   * Returns a new object of class '<em>Div Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div Expression</em>'.
   * @generated
   */
  DivExpression createDivExpression();

  /**
   * Returns a new object of class '<em>Mod Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mod Expression</em>'.
   * @generated
   */
  ModExpression createModExpression();

  /**
   * Returns a new object of class '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Expression</em>'.
   * @generated
   */
  NotExpression createNotExpression();

  /**
   * Returns a new object of class '<em>Unary Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Minus</em>'.
   * @generated
   */
  UnaryMinus createUnaryMinus();

  /**
   * Returns a new object of class '<em>Array Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Index</em>'.
   * @generated
   */
  ArrayIndex createArrayIndex();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ThingMLPackage getThingMLPackage();

} //ThingMLFactory

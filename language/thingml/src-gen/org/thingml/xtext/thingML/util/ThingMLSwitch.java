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
package org.thingml.xtext.thingML.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.thingml.xtext.thingML.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLPackage
 * @generated
 */
public class ThingMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ThingMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThingMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ThingMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ThingMLPackage.THING_ML_MODEL:
      {
        ThingMLModel thingMLModel = (ThingMLModel)theEObject;
        T result = caseThingMLModel(thingMLModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PLATFORM_ANNOTATION:
      {
        PlatformAnnotation platformAnnotation = (PlatformAnnotation)theEObject;
        T result = casePlatformAnnotation(platformAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.ANNOTATED_ELEMENT:
      {
        AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
        T result = caseAnnotatedElement(annotatedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.TYPE_REF:
      {
        TypeRef typeRef = (TypeRef)theEObject;
        T result = caseTypeRef(typeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseAnnotatedElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PRIMITIVE_TYPE:
      {
        PrimitiveType primitiveType = (PrimitiveType)theEObject;
        T result = casePrimitiveType(primitiveType);
        if (result == null) result = caseType(primitiveType);
        if (result == null) result = caseAnnotatedElement(primitiveType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.OBJECT_TYPE:
      {
        ObjectType objectType = (ObjectType)theEObject;
        T result = caseObjectType(objectType);
        if (result == null) result = caseType(objectType);
        if (result == null) result = caseAnnotatedElement(objectType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = caseType(enumeration);
        if (result == null) result = caseAnnotatedElement(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.ENUMERATION_LITERAL:
      {
        EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
        T result = caseEnumerationLiteral(enumerationLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.THING:
      {
        Thing thing = (Thing)theEObject;
        T result = caseThing(thing);
        if (result == null) result = caseType(thing);
        if (result == null) result = caseAnnotatedElement(thing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PROPERTY_ASSIGN:
      {
        PropertyAssign propertyAssign = (PropertyAssign)theEObject;
        T result = casePropertyAssign(propertyAssign);
        if (result == null) result = caseAnnotatedElement(propertyAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PROTOCOL:
      {
        Protocol protocol = (Protocol)theEObject;
        T result = caseProtocol(protocol);
        if (result == null) result = caseAnnotatedElement(protocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseAnnotatedElement(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = caseAnnotatedElement(property);
        if (result == null) result = caseVariable(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = caseAnnotatedElement(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseAnnotatedElement(parameter);
        if (result == null) result = caseVariable(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PORT:
      {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = caseAnnotatedElement(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.REQUIRED_PORT:
      {
        RequiredPort requiredPort = (RequiredPort)theEObject;
        T result = caseRequiredPort(requiredPort);
        if (result == null) result = casePort(requiredPort);
        if (result == null) result = caseAnnotatedElement(requiredPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PROVIDED_PORT:
      {
        ProvidedPort providedPort = (ProvidedPort)theEObject;
        T result = caseProvidedPort(providedPort);
        if (result == null) result = casePort(providedPort);
        if (result == null) result = caseAnnotatedElement(providedPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.INTERNAL_PORT:
      {
        InternalPort internalPort = (InternalPort)theEObject;
        T result = caseInternalPort(internalPort);
        if (result == null) result = casePort(internalPort);
        if (result == null) result = caseAnnotatedElement(internalPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.REGION:
      {
        Region region = (Region)theEObject;
        T result = caseRegion(region);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.REGION_OR_SESSION:
      {
        RegionOrSession regionOrSession = (RegionOrSession)theEObject;
        T result = caseRegionOrSession(regionOrSession);
        if (result == null) result = caseRegion(regionOrSession);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.COMPOSITE_STATE:
      {
        CompositeState compositeState = (CompositeState)theEObject;
        T result = caseCompositeState(compositeState);
        if (result == null) result = caseRegion(compositeState);
        if (result == null) result = caseState(compositeState);
        if (result == null) result = caseAnnotatedElement(compositeState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.FINAL_STATE:
      {
        FinalState finalState = (FinalState)theEObject;
        T result = caseFinalState(finalState);
        if (result == null) result = caseState(finalState);
        if (result == null) result = caseAnnotatedElement(finalState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.SESSION:
      {
        Session session = (Session)theEObject;
        T result = caseSession(session);
        if (result == null) result = caseAnnotatedElement(session);
        if (result == null) result = caseRegionOrSession(session);
        if (result == null) result = caseRegion(session);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PARALLEL_REGION:
      {
        ParallelRegion parallelRegion = (ParallelRegion)theEObject;
        T result = caseParallelRegion(parallelRegion);
        if (result == null) result = caseAnnotatedElement(parallelRegion);
        if (result == null) result = caseRegionOrSession(parallelRegion);
        if (result == null) result = caseRegion(parallelRegion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = caseAnnotatedElement(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.HANDLER:
      {
        Handler handler = (Handler)theEObject;
        T result = caseHandler(handler);
        if (result == null) result = caseAnnotatedElement(handler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = caseHandler(transition);
        if (result == null) result = caseAnnotatedElement(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.INTERNAL_TRANSITION:
      {
        InternalTransition internalTransition = (InternalTransition)theEObject;
        T result = caseInternalTransition(internalTransition);
        if (result == null) result = caseHandler(internalTransition);
        if (result == null) result = caseAnnotatedElement(internalTransition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.RECEIVE_MESSAGE:
      {
        ReceiveMessage receiveMessage = (ReceiveMessage)theEObject;
        T result = caseReceiveMessage(receiveMessage);
        if (result == null) result = caseEvent(receiveMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.ACTION_BLOCK:
      {
        ActionBlock actionBlock = (ActionBlock)theEObject;
        T result = caseActionBlock(actionBlock);
        if (result == null) result = caseAction(actionBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.EXTERN_STATEMENT:
      {
        ExternStatement externStatement = (ExternStatement)theEObject;
        T result = caseExternStatement(externStatement);
        if (result == null) result = caseAction(externStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.LOCAL_VARIABLE:
      {
        LocalVariable localVariable = (LocalVariable)theEObject;
        T result = caseLocalVariable(localVariable);
        if (result == null) result = caseAnnotatedElement(localVariable);
        if (result == null) result = caseAction(localVariable);
        if (result == null) result = caseVariable(localVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.SEND_ACTION:
      {
        SendAction sendAction = (SendAction)theEObject;
        T result = caseSendAction(sendAction);
        if (result == null) result = caseAction(sendAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.VARIABLE_ASSIGNMENT:
      {
        VariableAssignment variableAssignment = (VariableAssignment)theEObject;
        T result = caseVariableAssignment(variableAssignment);
        if (result == null) result = caseAction(variableAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.INCREMENT:
      {
        Increment increment = (Increment)theEObject;
        T result = caseIncrement(increment);
        if (result == null) result = caseAction(increment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.DECREMENT:
      {
        Decrement decrement = (Decrement)theEObject;
        T result = caseDecrement(decrement);
        if (result == null) result = caseAction(decrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.LOOP_ACTION:
      {
        LoopAction loopAction = (LoopAction)theEObject;
        T result = caseLoopAction(loopAction);
        if (result == null) result = caseAction(loopAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.CONDITIONAL_ACTION:
      {
        ConditionalAction conditionalAction = (ConditionalAction)theEObject;
        T result = caseConditionalAction(conditionalAction);
        if (result == null) result = caseAction(conditionalAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.RETURN_ACTION:
      {
        ReturnAction returnAction = (ReturnAction)theEObject;
        T result = caseReturnAction(returnAction);
        if (result == null) result = caseAction(returnAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PRINT_ACTION:
      {
        PrintAction printAction = (PrintAction)theEObject;
        T result = casePrintAction(printAction);
        if (result == null) result = caseAction(printAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.ERROR_ACTION:
      {
        ErrorAction errorAction = (ErrorAction)theEObject;
        T result = caseErrorAction(errorAction);
        if (result == null) result = caseAction(errorAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.START_SESSION:
      {
        StartSession startSession = (StartSession)theEObject;
        T result = caseStartSession(startSession);
        if (result == null) result = caseAction(startSession);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.FUNCTION_CALL_STATEMENT:
      {
        FunctionCallStatement functionCallStatement = (FunctionCallStatement)theEObject;
        T result = caseFunctionCallStatement(functionCallStatement);
        if (result == null) result = caseAction(functionCallStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.EXTERN_EXPRESSION:
      {
        ExternExpression externExpression = (ExternExpression)theEObject;
        T result = caseExternExpression(externExpression);
        if (result == null) result = caseExpression(externExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.ENUM_LITERAL_REF:
      {
        EnumLiteralRef enumLiteralRef = (EnumLiteralRef)theEObject;
        T result = caseEnumLiteralRef(enumLiteralRef);
        if (result == null) result = caseExpression(enumLiteralRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseExpression(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.DOUBLE_LITERAL:
      {
        DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
        T result = caseDoubleLiteral(doubleLiteral);
        if (result == null) result = caseExpression(doubleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PROPERTY_REFERENCE:
      {
        PropertyReference propertyReference = (PropertyReference)theEObject;
        T result = casePropertyReference(propertyReference);
        if (result == null) result = caseExpression(propertyReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.EVENT_REFERENCE:
      {
        EventReference eventReference = (EventReference)theEObject;
        T result = caseEventReference(eventReference);
        if (result == null) result = caseExpression(eventReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.FUNCTION_CALL_EXPRESSION:
      {
        FunctionCallExpression functionCallExpression = (FunctionCallExpression)theEObject;
        T result = caseFunctionCallExpression(functionCallExpression);
        if (result == null) result = caseExpression(functionCallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.CONFIGURATION:
      {
        Configuration configuration = (Configuration)theEObject;
        T result = caseConfiguration(configuration);
        if (result == null) result = caseAnnotatedElement(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.INSTANCE:
      {
        Instance instance = (Instance)theEObject;
        T result = caseInstance(instance);
        if (result == null) result = caseAnnotatedElement(instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.CONFIG_PROPERTY_ASSIGN:
      {
        ConfigPropertyAssign configPropertyAssign = (ConfigPropertyAssign)theEObject;
        T result = caseConfigPropertyAssign(configPropertyAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.ABSTRACT_CONNECTOR:
      {
        AbstractConnector abstractConnector = (AbstractConnector)theEObject;
        T result = caseAbstractConnector(abstractConnector);
        if (result == null) result = caseAnnotatedElement(abstractConnector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.CONNECTOR:
      {
        Connector connector = (Connector)theEObject;
        T result = caseConnector(connector);
        if (result == null) result = caseAbstractConnector(connector);
        if (result == null) result = caseAnnotatedElement(connector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.EXTERNAL_CONNECTOR:
      {
        ExternalConnector externalConnector = (ExternalConnector)theEObject;
        T result = caseExternalConnector(externalConnector);
        if (result == null) result = caseAbstractConnector(externalConnector);
        if (result == null) result = caseAnnotatedElement(externalConnector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.EQUALS_EXPRESSION:
      {
        EqualsExpression equalsExpression = (EqualsExpression)theEObject;
        T result = caseEqualsExpression(equalsExpression);
        if (result == null) result = caseExpression(equalsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.NOT_EQUALS_EXPRESSION:
      {
        NotEqualsExpression notEqualsExpression = (NotEqualsExpression)theEObject;
        T result = caseNotEqualsExpression(notEqualsExpression);
        if (result == null) result = caseExpression(notEqualsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.GREATER_EXPRESSION:
      {
        GreaterExpression greaterExpression = (GreaterExpression)theEObject;
        T result = caseGreaterExpression(greaterExpression);
        if (result == null) result = caseExpression(greaterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.LOWER_EXPRESSION:
      {
        LowerExpression lowerExpression = (LowerExpression)theEObject;
        T result = caseLowerExpression(lowerExpression);
        if (result == null) result = caseExpression(lowerExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.GREATER_OR_EQUAL_EXPRESSION:
      {
        GreaterOrEqualExpression greaterOrEqualExpression = (GreaterOrEqualExpression)theEObject;
        T result = caseGreaterOrEqualExpression(greaterOrEqualExpression);
        if (result == null) result = caseExpression(greaterOrEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.LOWER_OR_EQUAL_EXPRESSION:
      {
        LowerOrEqualExpression lowerOrEqualExpression = (LowerOrEqualExpression)theEObject;
        T result = caseLowerOrEqualExpression(lowerOrEqualExpression);
        if (result == null) result = caseExpression(lowerOrEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.PLUS_EXPRESSION:
      {
        PlusExpression plusExpression = (PlusExpression)theEObject;
        T result = casePlusExpression(plusExpression);
        if (result == null) result = caseExpression(plusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.MINUS_EXPRESSION:
      {
        MinusExpression minusExpression = (MinusExpression)theEObject;
        T result = caseMinusExpression(minusExpression);
        if (result == null) result = caseExpression(minusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.TIMES_EXPRESSION:
      {
        TimesExpression timesExpression = (TimesExpression)theEObject;
        T result = caseTimesExpression(timesExpression);
        if (result == null) result = caseExpression(timesExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.DIV_EXPRESSION:
      {
        DivExpression divExpression = (DivExpression)theEObject;
        T result = caseDivExpression(divExpression);
        if (result == null) result = caseExpression(divExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.MOD_EXPRESSION:
      {
        ModExpression modExpression = (ModExpression)theEObject;
        T result = caseModExpression(modExpression);
        if (result == null) result = caseExpression(modExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.NOT_EXPRESSION:
      {
        NotExpression notExpression = (NotExpression)theEObject;
        T result = caseNotExpression(notExpression);
        if (result == null) result = caseExpression(notExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.UNARY_MINUS:
      {
        UnaryMinus unaryMinus = (UnaryMinus)theEObject;
        T result = caseUnaryMinus(unaryMinus);
        if (result == null) result = caseExpression(unaryMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingMLPackage.ARRAY_INDEX:
      {
        ArrayIndex arrayIndex = (ArrayIndex)theEObject;
        T result = caseArrayIndex(arrayIndex);
        if (result == null) result = caseExpression(arrayIndex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThingMLModel(ThingMLModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Platform Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Platform Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlatformAnnotation(PlatformAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedElement(AnnotatedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRef(TypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveType(PrimitiveType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectType(ObjectType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationLiteral(EnumerationLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThing(Thing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyAssign(PropertyAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocol(Protocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredPort(RequiredPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedPort(ProvidedPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalPort(InternalPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Region</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegion(Region object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Region Or Session</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Region Or Session</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegionOrSession(RegionOrSession object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeState(CompositeState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinalState(FinalState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Session</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Session</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSession(Session object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel Region</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel Region</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallelRegion(ParallelRegion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Handler</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Handler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHandler(Handler object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalTransition(InternalTransition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Receive Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Receive Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReceiveMessage(ReceiveMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionBlock(ActionBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extern Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extern Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternStatement(ExternStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalVariable(LocalVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Send Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Send Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSendAction(SendAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAssignment(VariableAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Increment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Increment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncrement(Increment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decrement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decrement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecrement(Decrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopAction(LoopAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalAction(ConditionalAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnAction(ReturnAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrintAction(PrintAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorAction(ErrorAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Session</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Session</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartSession(StartSession object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCallStatement(FunctionCallStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extern Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extern Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternExpression(ExternExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Literal Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Literal Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumLiteralRef(EnumLiteralRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleLiteral(DoubleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyReference(PropertyReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventReference(EventReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCallExpression(FunctionCallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfiguration(Configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstance(Instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config Property Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config Property Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigPropertyAssign(ConfigPropertyAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractConnector(AbstractConnector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnector(Connector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalConnector(ExternalConnector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equals Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equals Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualsExpression(EqualsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Equals Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Equals Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotEqualsExpression(NotEqualsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greater Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greater Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreaterExpression(GreaterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lower Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lower Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLowerExpression(LowerExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greater Or Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greater Or Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreaterOrEqualExpression(GreaterOrEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lower Or Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lower Or Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLowerOrEqualExpression(LowerOrEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusExpression(PlusExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinusExpression(MinusExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Times Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Times Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimesExpression(TimesExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivExpression(DivExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModExpression(ModExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotExpression(NotExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryMinus(UnaryMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayIndex(ArrayIndex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ThingMLSwitch

/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.selenium.Variable#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.Variable#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.Variable#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Instruction
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' attribute.
   * @see #setAttr(String)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getVariable_Attr()
   * @model
   * @generated
   */
  String getAttr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.Variable#getAttr <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' attribute.
   * @see #getAttr()
   * @generated
   */
  void setAttr(String value);

  /**
   * Returns the value of the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' containment reference.
   * @see #setElem(Element)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getVariable_Elem()
   * @model containment="true"
   * @generated
   */
  Element getElem();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.Variable#getElem <em>Elem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' containment reference.
   * @see #getElem()
   * @generated
   */
  void setElem(Element value);

} // Variable

package pl.softfly.integ.samples.invoice.jaxws.doc.validation.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the pl.softfly.integ.samples.invoice.jaxws.doc.validation.schema package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of
 * XML content can consist of schema derived interfaces and classes representing the binding of
 * schema type definitions, element declarations and model groups.  Factory methods for each of
 * these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _ValidateResponse_QNAME = new QName(
      "http://schema.validation.doc.jaxws.invoice.samples.integ.softfly.pl/", "validateResponse");
  private final static QName _Validate_QNAME = new QName(
      "http://schema.validation.doc.jaxws.invoice.samples.integ.softfly.pl/", "validate");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: pl.softfly.integ.samples.invoice.jaxws.doc.validation.schema
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link ValidateResponse }
   */
  public ValidateResponse createValidateResponse() {
    return new ValidateResponse();
  }

  /**
   * Create an instance of {@link Validate }
   */
  public Validate createValidate() {
    return new Validate();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ValidateResponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schema.validation.doc.jaxws.invoice.samples.integ.softfly.pl/", name = "validateResponse")
  public JAXBElement<ValidateResponse> createValidateResponse(ValidateResponse value) {
    return new JAXBElement<ValidateResponse>(_ValidateResponse_QNAME, ValidateResponse.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Validate }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schema.validation.doc.jaxws.invoice.samples.integ.softfly.pl/", name = "validate")
  public JAXBElement<Validate> createValidate(Validate value) {
    return new JAXBElement<Validate>(_Validate_QNAME, Validate.class, null, value);
  }

}

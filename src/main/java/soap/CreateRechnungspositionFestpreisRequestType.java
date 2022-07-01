/**
 * CreateRechnungspositionFestpreisRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zu Anlage einer neuen Festpreis-Rechnungsposition
 */
public class CreateRechnungspositionFestpreisRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateRechnungspositionFestpreisRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateRechnungspositionFestpreisRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungspositionFestpreis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungspositionFestpreis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungspositionFestpreisType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Daten der anzulegenden Festpreis-Rechnungsposition. */
    private RechnungspositionFestpreisType rechnungspositionFestpreis;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateRechnungspositionFestpreisRequestType() {
    }


    public CreateRechnungspositionFestpreisRequestType(
            RequestHeaderType requestHeader,
            RechnungspositionFestpreisType rechnungspositionFestpreis) {
        this.requestHeader = requestHeader;
        this.rechnungspositionFestpreis = rechnungspositionFestpreis;
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the requestHeader value for this CreateRechnungspositionFestpreisRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this CreateRechnungspositionFestpreisRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the rechnungspositionFestpreis value for this CreateRechnungspositionFestpreisRequestType.
     *
     * @return rechnungspositionFestpreis   * Die Daten der anzulegenden Festpreis-Rechnungsposition.
     */
    public RechnungspositionFestpreisType getRechnungspositionFestpreis() {
        return rechnungspositionFestpreis;
    }

    /**
     * Sets the rechnungspositionFestpreis value for this CreateRechnungspositionFestpreisRequestType.
     *
     * @param rechnungspositionFestpreis   * Die Daten der anzulegenden Festpreis-Rechnungsposition.
     */
    public void setRechnungspositionFestpreis(RechnungspositionFestpreisType rechnungspositionFestpreis) {
        this.rechnungspositionFestpreis = rechnungspositionFestpreis;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateRechnungspositionFestpreisRequestType)) return false;
        CreateRechnungspositionFestpreisRequestType other = (CreateRechnungspositionFestpreisRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.requestHeader == null && other.getRequestHeader() == null) ||
                        (this.requestHeader != null &&
                                this.requestHeader.equals(other.getRequestHeader()))) &&
                ((this.rechnungspositionFestpreis == null && other.getRechnungspositionFestpreis() == null) ||
                        (this.rechnungspositionFestpreis != null &&
                                this.rechnungspositionFestpreis.equals(other.getRechnungspositionFestpreis())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getRechnungspositionFestpreis() != null) {
            _hashCode += getRechnungspositionFestpreis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

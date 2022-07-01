/**
 * CreateArtikelRechnungspositionRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zu Anlage einer neuen Artikel-Rechnungsposition
 */
public class CreateArtikelRechnungspositionRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateArtikelRechnungspositionRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateArtikelRechnungspositionRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artikelRechnungsposition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artikelRechnungsposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ArtikelRechnungspositionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Daten der anzulegenden Festpreis-Rechnungsposition. */
    private ArtikelRechnungspositionType artikelRechnungsposition;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateArtikelRechnungspositionRequestType() {
    }


    public CreateArtikelRechnungspositionRequestType(
            RequestHeaderType requestHeader,
            ArtikelRechnungspositionType artikelRechnungsposition) {
        this.requestHeader = requestHeader;
        this.artikelRechnungsposition = artikelRechnungsposition;
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
     * Gets the requestHeader value for this CreateArtikelRechnungspositionRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this CreateArtikelRechnungspositionRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the artikelRechnungsposition value for this CreateArtikelRechnungspositionRequestType.
     *
     * @return artikelRechnungsposition   * Die Daten der anzulegenden Festpreis-Rechnungsposition.
     */
    public ArtikelRechnungspositionType getArtikelRechnungsposition() {
        return artikelRechnungsposition;
    }

    /**
     * Sets the artikelRechnungsposition value for this CreateArtikelRechnungspositionRequestType.
     *
     * @param artikelRechnungsposition   * Die Daten der anzulegenden Festpreis-Rechnungsposition.
     */
    public void setArtikelRechnungsposition(ArtikelRechnungspositionType artikelRechnungsposition) {
        this.artikelRechnungsposition = artikelRechnungsposition;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateArtikelRechnungspositionRequestType)) return false;
        CreateArtikelRechnungspositionRequestType other = (CreateArtikelRechnungspositionRequestType) obj;
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
                ((this.artikelRechnungsposition == null && other.getArtikelRechnungsposition() == null) ||
                        (this.artikelRechnungsposition != null &&
                                this.artikelRechnungsposition.equals(other.getArtikelRechnungsposition())));
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
        if (getArtikelRechnungsposition() != null) {
            _hashCode += getArtikelRechnungsposition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

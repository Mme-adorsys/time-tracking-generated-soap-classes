/**
 * ReadProjekteResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort beim Lesen von Projekten.
 */
public class ReadProjekteResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadProjekteResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadProjekteResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "projekt"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gelesenen Projekte. */
    private ProjektType[] projektListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadProjekteResponseType() {
    }


    public ReadProjekteResponseType(
            ResponseHeaderType responseHeader,
            ProjektType[] projektListe) {
        this.responseHeader = responseHeader;
        this.projektListe = projektListe;
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
     * Gets the responseHeader value for this ReadProjekteResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadProjekteResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the projektListe value for this ReadProjekteResponseType.
     *
     * @return projektListe   * Die Liste der gelesenen Projekte.
     */
    public ProjektType[] getProjektListe() {
        return projektListe;
    }

    /**
     * Sets the projektListe value for this ReadProjekteResponseType.
     *
     * @param projektListe   * Die Liste der gelesenen Projekte.
     */
    public void setProjektListe(ProjektType[] projektListe) {
        this.projektListe = projektListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadProjekteResponseType)) return false;
        ReadProjekteResponseType other = (ReadProjekteResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.responseHeader == null && other.getResponseHeader() == null) ||
                        (this.responseHeader != null &&
                                this.responseHeader.equals(other.getResponseHeader()))) &&
                ((this.projektListe == null && other.getProjektListe() == null) ||
                        (this.projektListe != null &&
                                java.util.Arrays.equals(this.projektListe, other.getProjektListe())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getProjektListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjektListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjektListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

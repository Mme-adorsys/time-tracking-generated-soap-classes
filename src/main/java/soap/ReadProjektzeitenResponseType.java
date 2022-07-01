/**
 * ReadProjektzeitenResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Ergebnis der Projektzeiten-Abfrage.
 */
public class ReadProjektzeitenResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadProjektzeitenResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadProjektzeitenResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektzeitListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektzeitListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektzeitType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "projektzeiten"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gelesenen Zeitbuchungen. */
    private ProjektzeitType[] projektzeitListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadProjektzeitenResponseType() {
    }


    public ReadProjektzeitenResponseType(
            ResponseHeaderType responseHeader,
            ProjektzeitType[] projektzeitListe) {
        this.responseHeader = responseHeader;
        this.projektzeitListe = projektzeitListe;
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
     * Gets the responseHeader value for this ReadProjektzeitenResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadProjektzeitenResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the projektzeitListe value for this ReadProjektzeitenResponseType.
     *
     * @return projektzeitListe   * Die Liste der gelesenen Zeitbuchungen.
     */
    public ProjektzeitType[] getProjektzeitListe() {
        return projektzeitListe;
    }

    /**
     * Sets the projektzeitListe value for this ReadProjektzeitenResponseType.
     *
     * @param projektzeitListe   * Die Liste der gelesenen Zeitbuchungen.
     */
    public void setProjektzeitListe(ProjektzeitType[] projektzeitListe) {
        this.projektzeitListe = projektzeitListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadProjektzeitenResponseType)) return false;
        ReadProjektzeitenResponseType other = (ReadProjektzeitenResponseType) obj;
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
                ((this.projektzeitListe == null && other.getProjektzeitListe() == null) ||
                        (this.projektzeitListe != null &&
                                java.util.Arrays.equals(this.projektzeitListe, other.getProjektzeitListe())));
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
        if (getProjektzeitListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjektzeitListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjektzeitListe(), i);
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

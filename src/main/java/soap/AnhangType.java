/**
 * AnhangType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Ein Beleganhang. Enthält die Base-64 codierten Daten der Belegdatei
 * (Bild oder PDF).
 */
public class AnhangType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AnhangType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnhangType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inhalt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inhalt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Base64 codierten Daten des Beleganhangs (Bild oder PDF). */
    private byte[] inhalt;
    /* Der Dateiname des Beleganhangs. */
    private String name;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AnhangType() {
    }


    public AnhangType(
            byte[] inhalt,
            String name) {
        this.inhalt = inhalt;
        this.name = name;
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
     * Gets the inhalt value for this AnhangType.
     *
     * @return inhalt   * Die Base64 codierten Daten des Beleganhangs (Bild oder PDF).
     */
    public byte[] getInhalt() {
        return inhalt;
    }

    /**
     * Sets the inhalt value for this AnhangType.
     *
     * @param inhalt   * Die Base64 codierten Daten des Beleganhangs (Bild oder PDF).
     */
    public void setInhalt(byte[] inhalt) {
        this.inhalt = inhalt;
    }

    /**
     * Gets the name value for this AnhangType.
     *
     * @return name   * Der Dateiname des Beleganhangs.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name value for this AnhangType.
     *
     * @param name   * Der Dateiname des Beleganhangs.
     */
    public void setName(String name) {
        this.name = name;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AnhangType)) return false;
        AnhangType other = (AnhangType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.inhalt == null && other.getInhalt() == null) ||
                        (this.inhalt != null &&
                                java.util.Arrays.equals(this.inhalt, other.getInhalt()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInhalt() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getInhalt());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getInhalt(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

/**
 * SchlagwortType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Es reicht ein Schlagwort einer Sprache einzugeben bei der Suche.
 * Beim Anlegen bzw. Bearbeiten es ist zu empfehlen die Synonyme in der
 * 3 Sprachen einzegeben wenn das Schlagwort noch nicht in Stammdaten
 * definiert.
 */
public class SchlagwortType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SchlagwortType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "SchlagwortType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("de");
        elemField.setXmlName(new javax.xml.namespace.QName("", "de"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("en");
        elemField.setXmlName(new javax.xml.namespace.QName("", "en"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String de;
    private String en;
    private String fr;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public SchlagwortType() {
    }


    public SchlagwortType(
            String de,
            String en,
            String fr) {
        this.de = de;
        this.en = en;
        this.fr = fr;
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
     * Gets the de value for this SchlagwortType.
     *
     * @return de
     */
    public String getDe() {
        return de;
    }

    /**
     * Sets the de value for this SchlagwortType.
     *
     * @param de
     */
    public void setDe(String de) {
        this.de = de;
    }

    /**
     * Gets the en value for this SchlagwortType.
     *
     * @return en
     */
    public String getEn() {
        return en;
    }

    /**
     * Sets the en value for this SchlagwortType.
     *
     * @param en
     */
    public void setEn(String en) {
        this.en = en;
    }

    /**
     * Gets the fr value for this SchlagwortType.
     *
     * @return fr
     */
    public String getFr() {
        return fr;
    }

    /**
     * Sets the fr value for this SchlagwortType.
     *
     * @param fr
     */
    public void setFr(String fr) {
        this.fr = fr;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SchlagwortType)) return false;
        SchlagwortType other = (SchlagwortType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.de == null && other.getDe() == null) ||
                        (this.de != null &&
                                this.de.equals(other.getDe()))) &&
                ((this.en == null && other.getEn() == null) ||
                        (this.en != null &&
                                this.en.equals(other.getEn()))) &&
                ((this.fr == null && other.getFr() == null) ||
                        (this.fr != null &&
                                this.fr.equals(other.getFr())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDe() != null) {
            _hashCode += getDe().hashCode();
        }
        if (getEn() != null) {
            _hashCode += getEn().hashCode();
        }
        if (getFr() != null) {
            _hashCode += getFr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

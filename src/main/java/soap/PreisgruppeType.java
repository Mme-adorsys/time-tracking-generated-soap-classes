/**
 * PreisgruppeType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class PreisgruppeType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PreisgruppeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "PreisgruppeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurzform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurzform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung_de");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung_de"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung_en");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung_en"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung_fr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung_fr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inaktiv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inaktiv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String kurzform;
    private String bezeichnung_de;
    private String bezeichnung_en;
    private String bezeichnung_fr;
    private Boolean inaktiv;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public PreisgruppeType() {
    }


    public PreisgruppeType(
            String kurzform,
            String bezeichnung_de,
            String bezeichnung_en,
            String bezeichnung_fr,
            Boolean inaktiv) {
        this.kurzform = kurzform;
        this.bezeichnung_de = bezeichnung_de;
        this.bezeichnung_en = bezeichnung_en;
        this.bezeichnung_fr = bezeichnung_fr;
        this.inaktiv = inaktiv;
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
     * Gets the kurzform value for this PreisgruppeType.
     *
     * @return kurzform
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Sets the kurzform value for this PreisgruppeType.
     *
     * @param kurzform
     */
    public void setKurzform(String kurzform) {
        this.kurzform = kurzform;
    }

    /**
     * Gets the bezeichnung_de value for this PreisgruppeType.
     *
     * @return bezeichnung_de
     */
    public String getBezeichnung_de() {
        return bezeichnung_de;
    }

    /**
     * Sets the bezeichnung_de value for this PreisgruppeType.
     *
     * @param bezeichnung_de
     */
    public void setBezeichnung_de(String bezeichnung_de) {
        this.bezeichnung_de = bezeichnung_de;
    }

    /**
     * Gets the bezeichnung_en value for this PreisgruppeType.
     *
     * @return bezeichnung_en
     */
    public String getBezeichnung_en() {
        return bezeichnung_en;
    }

    /**
     * Sets the bezeichnung_en value for this PreisgruppeType.
     *
     * @param bezeichnung_en
     */
    public void setBezeichnung_en(String bezeichnung_en) {
        this.bezeichnung_en = bezeichnung_en;
    }

    /**
     * Gets the bezeichnung_fr value for this PreisgruppeType.
     *
     * @return bezeichnung_fr
     */
    public String getBezeichnung_fr() {
        return bezeichnung_fr;
    }

    /**
     * Sets the bezeichnung_fr value for this PreisgruppeType.
     *
     * @param bezeichnung_fr
     */
    public void setBezeichnung_fr(String bezeichnung_fr) {
        this.bezeichnung_fr = bezeichnung_fr;
    }

    /**
     * Gets the inaktiv value for this PreisgruppeType.
     *
     * @return inaktiv
     */
    public Boolean getInaktiv() {
        return inaktiv;
    }

    /**
     * Sets the inaktiv value for this PreisgruppeType.
     *
     * @param inaktiv
     */
    public void setInaktiv(Boolean inaktiv) {
        this.inaktiv = inaktiv;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PreisgruppeType)) return false;
        PreisgruppeType other = (PreisgruppeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.kurzform == null && other.getKurzform() == null) ||
                        (this.kurzform != null &&
                                this.kurzform.equals(other.getKurzform()))) &&
                ((this.bezeichnung_de == null && other.getBezeichnung_de() == null) ||
                        (this.bezeichnung_de != null &&
                                this.bezeichnung_de.equals(other.getBezeichnung_de()))) &&
                ((this.bezeichnung_en == null && other.getBezeichnung_en() == null) ||
                        (this.bezeichnung_en != null &&
                                this.bezeichnung_en.equals(other.getBezeichnung_en()))) &&
                ((this.bezeichnung_fr == null && other.getBezeichnung_fr() == null) ||
                        (this.bezeichnung_fr != null &&
                                this.bezeichnung_fr.equals(other.getBezeichnung_fr()))) &&
                ((this.inaktiv == null && other.getInaktiv() == null) ||
                        (this.inaktiv != null &&
                                this.inaktiv.equals(other.getInaktiv())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getKurzform() != null) {
            _hashCode += getKurzform().hashCode();
        }
        if (getBezeichnung_de() != null) {
            _hashCode += getBezeichnung_de().hashCode();
        }
        if (getBezeichnung_en() != null) {
            _hashCode += getBezeichnung_en().hashCode();
        }
        if (getBezeichnung_fr() != null) {
            _hashCode += getBezeichnung_fr().hashCode();
        }
        if (getInaktiv() != null) {
            _hashCode += getInaktiv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

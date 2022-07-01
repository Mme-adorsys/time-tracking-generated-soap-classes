/**
 * OrtType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class OrtType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(OrtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "OrtType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurzform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurzform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heimarbeitsort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "heimarbeitsort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inland");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inland"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waehrung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String kurzform;
    private String bezeichnung;
    private Boolean heimarbeitsort;
    private Boolean inland;
    private String waehrung;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public OrtType() {
    }


    public OrtType(
            String kurzform,
            String bezeichnung,
            Boolean heimarbeitsort,
            Boolean inland,
            String waehrung) {
        this.kurzform = kurzform;
        this.bezeichnung = bezeichnung;
        this.heimarbeitsort = heimarbeitsort;
        this.inland = inland;
        this.waehrung = waehrung;
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
     * Gets the kurzform value for this OrtType.
     *
     * @return kurzform
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Sets the kurzform value for this OrtType.
     *
     * @param kurzform
     */
    public void setKurzform(String kurzform) {
        this.kurzform = kurzform;
    }

    /**
     * Gets the bezeichnung value for this OrtType.
     *
     * @return bezeichnung
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this OrtType.
     *
     * @param bezeichnung
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the heimarbeitsort value for this OrtType.
     *
     * @return heimarbeitsort
     */
    public Boolean getHeimarbeitsort() {
        return heimarbeitsort;
    }

    /**
     * Sets the heimarbeitsort value for this OrtType.
     *
     * @param heimarbeitsort
     */
    public void setHeimarbeitsort(Boolean heimarbeitsort) {
        this.heimarbeitsort = heimarbeitsort;
    }

    /**
     * Gets the inland value for this OrtType.
     *
     * @return inland
     */
    public Boolean getInland() {
        return inland;
    }

    /**
     * Sets the inland value for this OrtType.
     *
     * @param inland
     */
    public void setInland(Boolean inland) {
        this.inland = inland;
    }

    /**
     * Gets the waehrung value for this OrtType.
     *
     * @return waehrung
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this OrtType.
     *
     * @param waehrung
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrtType)) return false;
        OrtType other = (OrtType) obj;
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
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
                ((this.heimarbeitsort == null && other.getHeimarbeitsort() == null) ||
                        (this.heimarbeitsort != null &&
                                this.heimarbeitsort.equals(other.getHeimarbeitsort()))) &&
                ((this.inland == null && other.getInland() == null) ||
                        (this.inland != null &&
                                this.inland.equals(other.getInland()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung())));
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
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        if (getHeimarbeitsort() != null) {
            _hashCode += getHeimarbeitsort().hashCode();
        }
        if (getInland() != null) {
            _hashCode += getInland().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

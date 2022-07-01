/**
 * ZahlungsartType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten einer Zahlungsart.
 */
public class ZahlungsartType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ZahlungsartType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ZahlungsartType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurzform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurzform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("erstattung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erstattung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buchhaltungsexportKonto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buchhaltungsexportKonto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Kurzform der Zahlungsart, z.B. 'Firma' , 'privat' */
    private String kurzform;
    /* Die Bezeichnung der Zahlungsart. */
    private String bezeichnung;
    /* Flagge, ob die Zahlungsart eine Erstattung impliziert. */
    private Boolean erstattung;
    /* Das Konto für den Buchhaltungexport (bei Einsatz des Moduls
     * 'Export für Buchhaltung'). */
    private String buchhaltungsexportKonto;
    /* Attribute für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ZahlungsartType() {
    }


    public ZahlungsartType(
            String kurzform,
            String bezeichnung,
            Boolean erstattung,
            String buchhaltungsexportKonto,
            AttributeType[] attributes) {
        this.kurzform = kurzform;
        this.bezeichnung = bezeichnung;
        this.erstattung = erstattung;
        this.buchhaltungsexportKonto = buchhaltungsexportKonto;
        this.attributes = attributes;
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
     * Gets the kurzform value for this ZahlungsartType.
     *
     * @return kurzform   * Die Kurzform der Zahlungsart, z.B. 'Firma' , 'privat'
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Sets the kurzform value for this ZahlungsartType.
     *
     * @param kurzform   * Die Kurzform der Zahlungsart, z.B. 'Firma' , 'privat'
     */
    public void setKurzform(String kurzform) {
        this.kurzform = kurzform;
    }

    /**
     * Gets the bezeichnung value for this ZahlungsartType.
     *
     * @return bezeichnung   * Die Bezeichnung der Zahlungsart.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this ZahlungsartType.
     *
     * @param bezeichnung   * Die Bezeichnung der Zahlungsart.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the erstattung value for this ZahlungsartType.
     *
     * @return erstattung   * Flagge, ob die Zahlungsart eine Erstattung impliziert.
     */
    public Boolean getErstattung() {
        return erstattung;
    }

    /**
     * Sets the erstattung value for this ZahlungsartType.
     *
     * @param erstattung   * Flagge, ob die Zahlungsart eine Erstattung impliziert.
     */
    public void setErstattung(Boolean erstattung) {
        this.erstattung = erstattung;
    }

    /**
     * Gets the buchhaltungsexportKonto value for this ZahlungsartType.
     *
     * @return buchhaltungsexportKonto   * Das Konto für den Buchhaltungexport (bei Einsatz des Moduls
     * 'Export für Buchhaltung').
     */
    public String getBuchhaltungsexportKonto() {
        return buchhaltungsexportKonto;
    }

    /**
     * Sets the buchhaltungsexportKonto value for this ZahlungsartType.
     *
     * @param buchhaltungsexportKonto   * Das Konto für den Buchhaltungexport (bei Einsatz des Moduls
     * 'Export für Buchhaltung').
     */
    public void setBuchhaltungsexportKonto(String buchhaltungsexportKonto) {
        this.buchhaltungsexportKonto = buchhaltungsexportKonto;
    }

    /**
     * Gets the attributes value for this ZahlungsartType.
     *
     * @return attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ZahlungsartType.
     *
     * @param attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ZahlungsartType)) return false;
        ZahlungsartType other = (ZahlungsartType) obj;
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
                ((this.erstattung == null && other.getErstattung() == null) ||
                        (this.erstattung != null &&
                                this.erstattung.equals(other.getErstattung()))) &&
                ((this.buchhaltungsexportKonto == null && other.getBuchhaltungsexportKonto() == null) ||
                        (this.buchhaltungsexportKonto != null &&
                                this.buchhaltungsexportKonto.equals(other.getBuchhaltungsexportKonto()))) &&
                ((this.attributes == null && other.getAttributes() == null) ||
                        (this.attributes != null &&
                                java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getErstattung() != null) {
            _hashCode += getErstattung().hashCode();
        }
        if (getBuchhaltungsexportKonto() != null) {
            _hashCode += getBuchhaltungsexportKonto().hashCode();
        }
        if (getAttributes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttributes(), i);
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

/**
 * ReadAbteilungSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zum Lesen von Abteilungen.
 */
public class ReadAbteilungSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadAbteilungSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAbteilungSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurzform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurzform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oberAbteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oberAbteilung"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String kurzform;
    private String oberAbteilung;
    private Boolean inaktiv;
    /* Technische Id der Abteilung. */
    private Integer id;
    /* Technische Id der übergeordneten
     *                 				Abteilung. */
    private Integer parentId;
    /* Liefert auch Abteilungsleiter die aktuell nicht beschaeftigte
     * Mitarbeiter sind.
     * Default = false. */
    private Boolean beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadAbteilungSearchCriteriaType() {
    }


    public ReadAbteilungSearchCriteriaType(
            String kurzform,
            String oberAbteilung,
            Boolean inaktiv,
            Integer id,
            Integer parentId,
            Boolean beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter) {
        this.kurzform = kurzform;
        this.oberAbteilung = oberAbteilung;
        this.inaktiv = inaktiv;
        this.id = id;
        this.parentId = parentId;
        this.beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter = beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter;
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
     * Gets the kurzform value for this ReadAbteilungSearchCriteriaType.
     *
     * @return kurzform
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Sets the kurzform value for this ReadAbteilungSearchCriteriaType.
     *
     * @param kurzform
     */
    public void setKurzform(String kurzform) {
        this.kurzform = kurzform;
    }

    /**
     * Gets the oberAbteilung value for this ReadAbteilungSearchCriteriaType.
     *
     * @return oberAbteilung
     */
    public String getOberAbteilung() {
        return oberAbteilung;
    }

    /**
     * Sets the oberAbteilung value for this ReadAbteilungSearchCriteriaType.
     *
     * @param oberAbteilung
     */
    public void setOberAbteilung(String oberAbteilung) {
        this.oberAbteilung = oberAbteilung;
    }

    /**
     * Gets the inaktiv value for this ReadAbteilungSearchCriteriaType.
     *
     * @return inaktiv
     */
    public Boolean getInaktiv() {
        return inaktiv;
    }

    /**
     * Sets the inaktiv value for this ReadAbteilungSearchCriteriaType.
     *
     * @param inaktiv
     */
    public void setInaktiv(Boolean inaktiv) {
        this.inaktiv = inaktiv;
    }

    /**
     * Gets the id value for this ReadAbteilungSearchCriteriaType.
     *
     * @return id   * Technische Id der Abteilung.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ReadAbteilungSearchCriteriaType.
     *
     * @param id   * Technische Id der Abteilung.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the parentId value for this ReadAbteilungSearchCriteriaType.
     *
     * @return parentId   * Technische Id der übergeordneten
     *                 				Abteilung.
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Sets the parentId value for this ReadAbteilungSearchCriteriaType.
     *
     * @param parentId   * Technische Id der übergeordneten
     *                 				Abteilung.
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets the beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter value for this ReadAbteilungSearchCriteriaType.
     *
     * @return beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter   * Liefert auch Abteilungsleiter die aktuell nicht beschaeftigte
     * Mitarbeiter sind.
     * Default = false.
     */
    public Boolean getBeiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter() {
        return beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter;
    }

    /**
     * Sets the beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter value for this ReadAbteilungSearchCriteriaType.
     *
     * @param beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter   * Liefert auch Abteilungsleiter die aktuell nicht beschaeftigte
     * Mitarbeiter sind.
     * Default = false.
     */
    public void setBeiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter(Boolean beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter) {
        this.beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter = beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadAbteilungSearchCriteriaType)) return false;
        ReadAbteilungSearchCriteriaType other = (ReadAbteilungSearchCriteriaType) obj;
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
                ((this.oberAbteilung == null && other.getOberAbteilung() == null) ||
                        (this.oberAbteilung != null &&
                                this.oberAbteilung.equals(other.getOberAbteilung()))) &&
                ((this.inaktiv == null && other.getInaktiv() == null) ||
                        (this.inaktiv != null &&
                                this.inaktiv.equals(other.getInaktiv()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.parentId == null && other.getParentId() == null) ||
                        (this.parentId != null &&
                                this.parentId.equals(other.getParentId()))) &&
                ((this.beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter == null && other.getBeiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter() == null) ||
                        (this.beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter != null &&
                                this.beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter.equals(other.getBeiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter())));
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
        if (getOberAbteilung() != null) {
            _hashCode += getOberAbteilung().hashCode();
        }
        if (getInaktiv() != null) {
            _hashCode += getInaktiv().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getBeiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter() != null) {
            _hashCode += getBeiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

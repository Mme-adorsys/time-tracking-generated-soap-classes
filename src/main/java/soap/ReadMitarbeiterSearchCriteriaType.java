/**
 * ReadMitarbeiterSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Kriterien für die Suche nach Mitarbeitern.
 */
public class ReadMitarbeiterSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadMitarbeiterSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadMitarbeiterSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("von");
        elemField.setXmlName(new javax.xml.namespace.QName("", "von"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inklusiveUnterabteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inklusiveUnterabteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedSince");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
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

    /* Der Benutzername des zu liefernden
     *                 				Mitarbeiters. */
    private String userId;
    /* Das Startdatum des Intervalls, in dem
     *                 				die zu liefernden Mitarbeiter
     *                 				beschäftigt sein müssen. Format:
     *                 				JJJJ-MM-TT. */
    private String von;
    /* Das Endedatum des Intervalls, in dem die
     *                 				zu liefernden Mitarbeiter beschäftigt
     *                 				sein müssen. Format: JJJJ-MM-TT. */
    private String bis;
    /* Die Abteilung der zu liefernden
     *                 				Mitarbeiter. */
    private String abteilung;
    /* Flagge, ob Mitarbeiter, die
     *                 				untergeordneten Abteilungen zugeordnet
     *                 				sind, ebenfalls geliefert werden sollen. */
    private Boolean inklusiveUnterabteilung;
    private String modifiedSince;
    private String email;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadMitarbeiterSearchCriteriaType() {
    }


    public ReadMitarbeiterSearchCriteriaType(
            String userId,
            String von,
            String bis,
            String abteilung,
            Boolean inklusiveUnterabteilung,
            String modifiedSince,
            String email,
            AttributeType[] attributes) {
        this.userId = userId;
        this.von = von;
        this.bis = bis;
        this.abteilung = abteilung;
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
        this.modifiedSince = modifiedSince;
        this.email = email;
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
     * Gets the userId value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @return userId   * Der Benutzername des zu liefernden
     *                 				Mitarbeiters.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @param userId   * Der Benutzername des zu liefernden
     *                 				Mitarbeiters.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the von value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @return von   * Das Startdatum des Intervalls, in dem
     *                 				die zu liefernden Mitarbeiter
     *                 				beschäftigt sein müssen. Format:
     *                 				JJJJ-MM-TT.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @param von   * Das Startdatum des Intervalls, in dem
     *                 				die zu liefernden Mitarbeiter
     *                 				beschäftigt sein müssen. Format:
     *                 				JJJJ-MM-TT.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @return bis   * Das Endedatum des Intervalls, in dem die
     *                 				zu liefernden Mitarbeiter beschäftigt
     *                 				sein müssen. Format: JJJJ-MM-TT.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @param bis   * Das Endedatum des Intervalls, in dem die
     *                 				zu liefernden Mitarbeiter beschäftigt
     *                 				sein müssen. Format: JJJJ-MM-TT.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the abteilung value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @return abteilung   * Die Abteilung der zu liefernden
     *                 				Mitarbeiter.
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @param abteilung   * Die Abteilung der zu liefernden
     *                 				Mitarbeiter.
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the inklusiveUnterabteilung value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @return inklusiveUnterabteilung   * Flagge, ob Mitarbeiter, die
     *                 				untergeordneten Abteilungen zugeordnet
     *                 				sind, ebenfalls geliefert werden sollen.
     */
    public Boolean getInklusiveUnterabteilung() {
        return inklusiveUnterabteilung;
    }

    /**
     * Sets the inklusiveUnterabteilung value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @param inklusiveUnterabteilung   * Flagge, ob Mitarbeiter, die
     *                 				untergeordneten Abteilungen zugeordnet
     *                 				sind, ebenfalls geliefert werden sollen.
     */
    public void setInklusiveUnterabteilung(Boolean inklusiveUnterabteilung) {
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
    }

    /**
     * Gets the modifiedSince value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the email value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the attributes value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ReadMitarbeiterSearchCriteriaType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadMitarbeiterSearchCriteriaType)) return false;
        ReadMitarbeiterSearchCriteriaType other = (ReadMitarbeiterSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.inklusiveUnterabteilung == null && other.getInklusiveUnterabteilung() == null) ||
                        (this.inklusiveUnterabteilung != null &&
                                this.inklusiveUnterabteilung.equals(other.getInklusiveUnterabteilung()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
                ((this.email == null && other.getEmail() == null) ||
                        (this.email != null &&
                                this.email.equals(other.getEmail()))) &&
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getInklusiveUnterabteilung() != null) {
            _hashCode += getInklusiveUnterabteilung().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
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

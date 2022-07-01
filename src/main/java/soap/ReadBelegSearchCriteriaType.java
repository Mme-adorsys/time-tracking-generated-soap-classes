/**
 * ReadBelegSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien für das Lesen von Belegen.
 */
public class ReadBelegSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadBelegSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadBelegSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("belegNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNrListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNrListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "projektNr"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userIdListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String32"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "userId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zahlungsart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlungsart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("projektId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

    /* Das Startdatum des Zeitraums, in dem Belege gesucht werden
     * sollen. Format: JJJJ-MM-TT. */
    private String von;
    /* Das Endedatum des Zeitraums, in dem Belege gesucht werden sollen.
     * Format: JJJJ-MM-TT. */
    private String bis;
    /* Die Nummer des Beleges, der geliefert werden soll. */
    private Integer belegNr;
    /* Eine Liste mit den Nummern der Projekte, in denen nach Belegen
     * gesucht werden soll. */
    private String[] projektNrListe;
    /* Eine Liste mit Benutzerids, in deren Belegen gesucht werden
     * soll. */
    private String[] userIdListe;
    /* Die Bezeichnung der Belegart, nach der gesucht werden soll. */
    private String belegart;
    /* Die Zahlungsart, nach der gesucht werden soll. */
    private String zahlungsart;
    private String modifiedSince;
    private Integer projektId;
    /* Attribute für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadBelegSearchCriteriaType() {
    }


    public ReadBelegSearchCriteriaType(
            String von,
            String bis,
            Integer belegNr,
            String[] projektNrListe,
            String[] userIdListe,
            String belegart,
            String zahlungsart,
            String modifiedSince,
            Integer projektId,
            AttributeType[] attributes) {
        this.von = von;
        this.bis = bis;
        this.belegNr = belegNr;
        this.projektNrListe = projektNrListe;
        this.userIdListe = userIdListe;
        this.belegart = belegart;
        this.zahlungsart = zahlungsart;
        this.modifiedSince = modifiedSince;
        this.projektId = projektId;
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
     * Gets the von value for this ReadBelegSearchCriteriaType.
     *
     * @return von   * Das Startdatum des Zeitraums, in dem Belege gesucht werden
     * sollen. Format: JJJJ-MM-TT.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ReadBelegSearchCriteriaType.
     *
     * @param von   * Das Startdatum des Zeitraums, in dem Belege gesucht werden
     * sollen. Format: JJJJ-MM-TT.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ReadBelegSearchCriteriaType.
     *
     * @return bis   * Das Endedatum des Zeitraums, in dem Belege gesucht werden sollen.
     * Format: JJJJ-MM-TT.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ReadBelegSearchCriteriaType.
     *
     * @param bis   * Das Endedatum des Zeitraums, in dem Belege gesucht werden sollen.
     * Format: JJJJ-MM-TT.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the belegNr value for this ReadBelegSearchCriteriaType.
     *
     * @return belegNr   * Die Nummer des Beleges, der geliefert werden soll.
     */
    public Integer getBelegNr() {
        return belegNr;
    }

    /**
     * Sets the belegNr value for this ReadBelegSearchCriteriaType.
     *
     * @param belegNr   * Die Nummer des Beleges, der geliefert werden soll.
     */
    public void setBelegNr(Integer belegNr) {
        this.belegNr = belegNr;
    }

    /**
     * Gets the projektNrListe value for this ReadBelegSearchCriteriaType.
     *
     * @return projektNrListe   * Eine Liste mit den Nummern der Projekte, in denen nach Belegen
     * gesucht werden soll.
     */
    public String[] getProjektNrListe() {
        return projektNrListe;
    }

    /**
     * Sets the projektNrListe value for this ReadBelegSearchCriteriaType.
     *
     * @param projektNrListe   * Eine Liste mit den Nummern der Projekte, in denen nach Belegen
     * gesucht werden soll.
     */
    public void setProjektNrListe(String[] projektNrListe) {
        this.projektNrListe = projektNrListe;
    }

    /**
     * Gets the userIdListe value for this ReadBelegSearchCriteriaType.
     *
     * @return userIdListe   * Eine Liste mit Benutzerids, in deren Belegen gesucht werden
     * soll.
     */
    public String[] getUserIdListe() {
        return userIdListe;
    }

    /**
     * Sets the userIdListe value for this ReadBelegSearchCriteriaType.
     *
     * @param userIdListe   * Eine Liste mit Benutzerids, in deren Belegen gesucht werden
     * soll.
     */
    public void setUserIdListe(String[] userIdListe) {
        this.userIdListe = userIdListe;
    }

    /**
     * Gets the belegart value for this ReadBelegSearchCriteriaType.
     *
     * @return belegart   * Die Bezeichnung der Belegart, nach der gesucht werden soll.
     */
    public String getBelegart() {
        return belegart;
    }

    /**
     * Sets the belegart value for this ReadBelegSearchCriteriaType.
     *
     * @param belegart   * Die Bezeichnung der Belegart, nach der gesucht werden soll.
     */
    public void setBelegart(String belegart) {
        this.belegart = belegart;
    }

    /**
     * Gets the zahlungsart value for this ReadBelegSearchCriteriaType.
     *
     * @return zahlungsart   * Die Zahlungsart, nach der gesucht werden soll.
     */
    public String getZahlungsart() {
        return zahlungsart;
    }

    /**
     * Sets the zahlungsart value for this ReadBelegSearchCriteriaType.
     *
     * @param zahlungsart   * Die Zahlungsart, nach der gesucht werden soll.
     */
    public void setZahlungsart(String zahlungsart) {
        this.zahlungsart = zahlungsart;
    }

    /**
     * Gets the modifiedSince value for this ReadBelegSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this ReadBelegSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the projektId value for this ReadBelegSearchCriteriaType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this ReadBelegSearchCriteriaType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the attributes value for this ReadBelegSearchCriteriaType.
     *
     * @return attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ReadBelegSearchCriteriaType.
     *
     * @param attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadBelegSearchCriteriaType)) return false;
        ReadBelegSearchCriteriaType other = (ReadBelegSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.belegNr == null && other.getBelegNr() == null) ||
                        (this.belegNr != null &&
                                this.belegNr.equals(other.getBelegNr()))) &&
                ((this.projektNrListe == null && other.getProjektNrListe() == null) ||
                        (this.projektNrListe != null &&
                                java.util.Arrays.equals(this.projektNrListe, other.getProjektNrListe()))) &&
                ((this.userIdListe == null && other.getUserIdListe() == null) ||
                        (this.userIdListe != null &&
                                java.util.Arrays.equals(this.userIdListe, other.getUserIdListe()))) &&
                ((this.belegart == null && other.getBelegart() == null) ||
                        (this.belegart != null &&
                                this.belegart.equals(other.getBelegart()))) &&
                ((this.zahlungsart == null && other.getZahlungsart() == null) ||
                        (this.zahlungsart != null &&
                                this.zahlungsart.equals(other.getZahlungsart()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
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
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getBelegNr() != null) {
            _hashCode += getBelegNr().hashCode();
        }
        if (getProjektNrListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjektNrListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjektNrListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserIdListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getUserIdListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUserIdListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBelegart() != null) {
            _hashCode += getBelegart().hashCode();
        }
        if (getZahlungsart() != null) {
            _hashCode += getZahlungsart().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
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

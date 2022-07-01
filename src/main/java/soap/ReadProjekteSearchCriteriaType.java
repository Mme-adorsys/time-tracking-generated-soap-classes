/**
 * ReadProjekteSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zur Suche nach Projekten.
 */
public class ReadProjekteSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadProjekteSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadProjekteSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schlagworteFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schlagworteFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "schlagwort"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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

    private Integer id;
    /* Das Anfangsdatum des Zeitraums, in dem
     *                 				die zu liefernden Projekte liegen
     *                 				müssen. Format: YYYY-MM-TT. */
    private String von;
    /* Das Enddatum des Zeitraums, in dem die
     *                 				zu liefernden Projekte liegen müssen.
     *                 				Format: YYYY-MM-TT. */
    private String bis;
    /* Die Nummer des zu liefernden Projektes. */
    private String projektNr;
    /* Die Abteilung, der die zu liefernden
     *                 				Projekte zugeordnet sein müssen. */
    private String abteilung;
    /* Der Status der zu liefernden Projekte. */
    private String status;
    private String modifiedSince;
    private String kundenNr;
    /* BItte dies n SearchCriteria statt
     *                 				schlagworteListe benutzen. Das
     *                 				Schlagwort kann hier egal in welcher
     *                 				Sprachen eingeben werden. -ohne- oder
     *                 				-without- oder -sans- lieferen Objekte
     *                 				Ohne Schlagworte */
    private String[] schlagworteFilter;
    private String userId;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadProjekteSearchCriteriaType() {
    }


    public ReadProjekteSearchCriteriaType(
            Integer id,
            String von,
            String bis,
            String projektNr,
            String abteilung,
            String status,
            String modifiedSince,
            String kundenNr,
            String[] schlagworteFilter,
            String userId,
            AttributeType[] attributes) {
        this.id = id;
        this.von = von;
        this.bis = bis;
        this.projektNr = projektNr;
        this.abteilung = abteilung;
        this.status = status;
        this.modifiedSince = modifiedSince;
        this.kundenNr = kundenNr;
        this.schlagworteFilter = schlagworteFilter;
        this.userId = userId;
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
     * Gets the id value for this ReadProjekteSearchCriteriaType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ReadProjekteSearchCriteriaType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the von value for this ReadProjekteSearchCriteriaType.
     *
     * @return von   * Das Anfangsdatum des Zeitraums, in dem
     *                 				die zu liefernden Projekte liegen
     *                 				müssen. Format: YYYY-MM-TT.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ReadProjekteSearchCriteriaType.
     *
     * @param von   * Das Anfangsdatum des Zeitraums, in dem
     *                 				die zu liefernden Projekte liegen
     *                 				müssen. Format: YYYY-MM-TT.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ReadProjekteSearchCriteriaType.
     *
     * @return bis   * Das Enddatum des Zeitraums, in dem die
     *                 				zu liefernden Projekte liegen müssen.
     *                 				Format: YYYY-MM-TT.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ReadProjekteSearchCriteriaType.
     *
     * @param bis   * Das Enddatum des Zeitraums, in dem die
     *                 				zu liefernden Projekte liegen müssen.
     *                 				Format: YYYY-MM-TT.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the projektNr value for this ReadProjekteSearchCriteriaType.
     *
     * @return projektNr   * Die Nummer des zu liefernden Projektes.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ReadProjekteSearchCriteriaType.
     *
     * @param projektNr   * Die Nummer des zu liefernden Projektes.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the abteilung value for this ReadProjekteSearchCriteriaType.
     *
     * @return abteilung   * Die Abteilung, der die zu liefernden
     *                 				Projekte zugeordnet sein müssen.
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this ReadProjekteSearchCriteriaType.
     *
     * @param abteilung   * Die Abteilung, der die zu liefernden
     *                 				Projekte zugeordnet sein müssen.
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the status value for this ReadProjekteSearchCriteriaType.
     *
     * @return status   * Der Status der zu liefernden Projekte.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status value for this ReadProjekteSearchCriteriaType.
     *
     * @param status   * Der Status der zu liefernden Projekte.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the modifiedSince value for this ReadProjekteSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this ReadProjekteSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the kundenNr value for this ReadProjekteSearchCriteriaType.
     *
     * @return kundenNr
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this ReadProjekteSearchCriteriaType.
     *
     * @param kundenNr
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the schlagworteFilter value for this ReadProjekteSearchCriteriaType.
     *
     * @return schlagworteFilter   * BItte dies n SearchCriteria statt
     *                 				schlagworteListe benutzen. Das
     *                 				Schlagwort kann hier egal in welcher
     *                 				Sprachen eingeben werden. -ohne- oder
     *                 				-without- oder -sans- lieferen Objekte
     *                 				Ohne Schlagworte
     */
    public String[] getSchlagworteFilter() {
        return schlagworteFilter;
    }

    /**
     * Sets the schlagworteFilter value for this ReadProjekteSearchCriteriaType.
     *
     * @param schlagworteFilter   * BItte dies n SearchCriteria statt
     *                 				schlagworteListe benutzen. Das
     *                 				Schlagwort kann hier egal in welcher
     *                 				Sprachen eingeben werden. -ohne- oder
     *                 				-without- oder -sans- lieferen Objekte
     *                 				Ohne Schlagworte
     */
    public void setSchlagworteFilter(String[] schlagworteFilter) {
        this.schlagworteFilter = schlagworteFilter;
    }

    /**
     * Gets the userId value for this ReadProjekteSearchCriteriaType.
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this ReadProjekteSearchCriteriaType.
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the attributes value for this ReadProjekteSearchCriteriaType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ReadProjekteSearchCriteriaType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadProjekteSearchCriteriaType)) return false;
        ReadProjekteSearchCriteriaType other = (ReadProjekteSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.schlagworteFilter == null && other.getSchlagworteFilter() == null) ||
                        (this.schlagworteFilter != null &&
                                java.util.Arrays.equals(this.schlagworteFilter, other.getSchlagworteFilter()))) &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getSchlagworteFilter() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSchlagworteFilter());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSchlagworteFilter(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
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

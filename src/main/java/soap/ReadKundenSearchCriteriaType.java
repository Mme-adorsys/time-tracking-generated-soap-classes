/**
 * ReadKundenSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Kriterien für die Suche nach Kunden.
 */
public class ReadKundenSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadKundenSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKundenSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
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
        elemField.setFieldName("kategorie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kategorie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branche");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branche"));
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
        elemField.setFieldName("inaktiv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inaktiv"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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

    /* Die Kundennummer des gesuchten Kunden. */
    private String kundenNr;
    /* Die Abteilung der zu liefernden Kunden. */
    private String abteilung;
    /* wir empfehlen 'kategorienKurzform' zu
     *                 				benutzen dies kann mehr als dies (dieses
     *                 				Element wird in Zukunft entfernt) */
    private String kategorie;
    /* Die Branche der zu liefernden Kunden. */
    private String branche;
    /* Flagge, ob Kunden, die untergeordneten
     *                 				Abteilungen zugeordnet sind, ebenfalls
     *                 				geliefert werden sollen. */
    private Boolean inklusiveUnterabteilung;
    /* Flagge, ob auch inaktive Kunden
     *                 				geliefert werden sollen. */
    private Boolean inaktiv;
    private String modifiedSince;
    private String name;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadKundenSearchCriteriaType() {
    }


    public ReadKundenSearchCriteriaType(
            String kundenNr,
            String abteilung,
            String kategorie,
            String branche,
            Boolean inklusiveUnterabteilung,
            Boolean inaktiv,
            String modifiedSince,
            String name,
            AttributeType[] attributes) {
        this.kundenNr = kundenNr;
        this.abteilung = abteilung;
        this.kategorie = kategorie;
        this.branche = branche;
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
        this.inaktiv = inaktiv;
        this.modifiedSince = modifiedSince;
        this.name = name;
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
     * Gets the kundenNr value for this ReadKundenSearchCriteriaType.
     *
     * @return kundenNr   * Die Kundennummer des gesuchten Kunden.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this ReadKundenSearchCriteriaType.
     *
     * @param kundenNr   * Die Kundennummer des gesuchten Kunden.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the abteilung value for this ReadKundenSearchCriteriaType.
     *
     * @return abteilung   * Die Abteilung der zu liefernden Kunden.
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this ReadKundenSearchCriteriaType.
     *
     * @param abteilung   * Die Abteilung der zu liefernden Kunden.
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the kategorie value for this ReadKundenSearchCriteriaType.
     *
     * @return kategorie   * wir empfehlen 'kategorienKurzform' zu
     *                 				benutzen dies kann mehr als dies (dieses
     *                 				Element wird in Zukunft entfernt)
     */
    public String getKategorie() {
        return kategorie;
    }

    /**
     * Sets the kategorie value for this ReadKundenSearchCriteriaType.
     *
     * @param kategorie   * wir empfehlen 'kategorienKurzform' zu
     *                 				benutzen dies kann mehr als dies (dieses
     *                 				Element wird in Zukunft entfernt)
     */
    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    /**
     * Gets the branche value for this ReadKundenSearchCriteriaType.
     *
     * @return branche   * Die Branche der zu liefernden Kunden.
     */
    public String getBranche() {
        return branche;
    }

    /**
     * Sets the branche value for this ReadKundenSearchCriteriaType.
     *
     * @param branche   * Die Branche der zu liefernden Kunden.
     */
    public void setBranche(String branche) {
        this.branche = branche;
    }

    /**
     * Gets the inklusiveUnterabteilung value for this ReadKundenSearchCriteriaType.
     *
     * @return inklusiveUnterabteilung   * Flagge, ob Kunden, die untergeordneten
     *                 				Abteilungen zugeordnet sind, ebenfalls
     *                 				geliefert werden sollen.
     */
    public Boolean getInklusiveUnterabteilung() {
        return inklusiveUnterabteilung;
    }

    /**
     * Sets the inklusiveUnterabteilung value for this ReadKundenSearchCriteriaType.
     *
     * @param inklusiveUnterabteilung   * Flagge, ob Kunden, die untergeordneten
     *                 				Abteilungen zugeordnet sind, ebenfalls
     *                 				geliefert werden sollen.
     */
    public void setInklusiveUnterabteilung(Boolean inklusiveUnterabteilung) {
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
    }

    /**
     * Gets the inaktiv value for this ReadKundenSearchCriteriaType.
     *
     * @return inaktiv   * Flagge, ob auch inaktive Kunden
     *                 				geliefert werden sollen.
     */
    public Boolean getInaktiv() {
        return inaktiv;
    }

    /**
     * Sets the inaktiv value for this ReadKundenSearchCriteriaType.
     *
     * @param inaktiv   * Flagge, ob auch inaktive Kunden
     *                 				geliefert werden sollen.
     */
    public void setInaktiv(Boolean inaktiv) {
        this.inaktiv = inaktiv;
    }

    /**
     * Gets the modifiedSince value for this ReadKundenSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this ReadKundenSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the name value for this ReadKundenSearchCriteriaType.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name value for this ReadKundenSearchCriteriaType.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the attributes value for this ReadKundenSearchCriteriaType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ReadKundenSearchCriteriaType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadKundenSearchCriteriaType)) return false;
        ReadKundenSearchCriteriaType other = (ReadKundenSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.kategorie == null && other.getKategorie() == null) ||
                        (this.kategorie != null &&
                                this.kategorie.equals(other.getKategorie()))) &&
                ((this.branche == null && other.getBranche() == null) ||
                        (this.branche != null &&
                                this.branche.equals(other.getBranche()))) &&
                ((this.inklusiveUnterabteilung == null && other.getInklusiveUnterabteilung() == null) ||
                        (this.inklusiveUnterabteilung != null &&
                                this.inklusiveUnterabteilung.equals(other.getInklusiveUnterabteilung()))) &&
                ((this.inaktiv == null && other.getInaktiv() == null) ||
                        (this.inaktiv != null &&
                                this.inaktiv.equals(other.getInaktiv()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
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
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getKategorie() != null) {
            _hashCode += getKategorie().hashCode();
        }
        if (getBranche() != null) {
            _hashCode += getBranche().hashCode();
        }
        if (getInklusiveUnterabteilung() != null) {
            _hashCode += getInklusiveUnterabteilung().hashCode();
        }
        if (getInaktiv() != null) {
            _hashCode += getInaktiv().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
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

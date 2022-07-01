/**
 * FilterProjekteSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zur Suche nach Projekten.
 */
public class FilterProjekteSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FilterProjekteSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FilterProjekteSearchCriteriaType"));
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
        elemField.setFieldName("projektNrListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNrListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "projektNr"));
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
        elemField.setFieldName("statusListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("kategorieFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kategorieFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String32"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "kategorie"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenNrListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNrListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String32"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "kundenNr"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suchbegriff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suchbegriff"));
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
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
    }

    private Integer id;
    /* Das Anfangsdatum des Zeitraums, in dem die zu liefernden Projekte
     * liegen müssen. Format: YYYY-MM-TT. */
    private String von;
    /* Das Enddatum des Zeitraums, in dem die zu liefernden Projekte
     * liegen müssen. Format: YYYY-MM-TT. */
    private String bis;
    /* Liste der Projekt-Nummern der zu berücksichtigenden Projekte. */
    private String[] projektNrListe;
    /* Die Abteilung, der die zu liefernden Projekte zugeordnet sein
     * müssen. */
    private String abteilung;
    /* default = false */
    private Boolean inklusiveUnterabteilung;
    /* Der Status der zu liefernden Projekte. */
    private String[] statusListe;
    /* Das Schlagwort kann hier egal in welcher Sprachen eingeben
     * werden. -ohne- oder -without- oder -sans- lieferen Objekte Ohne Schlagworte */
    private String[] schlagworteFilter;
    /* -ohne- oder -without- oder -sans- lieferen Objekte Ohne Schlagworte */
    private String[] kategorieFilter;
    private String[] kundenNrListe;
    /* Durch den in das Suchfeld eingebebenen Text wird die Ergebnistabelle
     * nach: Kurzform, Bezeichnung,Bemerkung eingeschränkt. Verwenden Sie
     * das %-Zeichen als Platzhalter (wildcard). D.h., mit % können Sie beliebige
     * Wörter/Buchstaben darstellen, die sich zwischen Ihren Suchbegriffen
     * befinden. */
    private String suchbegriff;
    private String modifiedSince;
    /* Liste von Attributen für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public FilterProjekteSearchCriteriaType() {
    }


    public FilterProjekteSearchCriteriaType(
            Integer id,
            String von,
            String bis,
            String[] projektNrListe,
            String abteilung,
            Boolean inklusiveUnterabteilung,
            String[] statusListe,
            String[] schlagworteFilter,
            String[] kategorieFilter,
            String[] kundenNrListe,
            String suchbegriff,
            String modifiedSince,
            AttributeType[] attributes) {
        this.id = id;
        this.von = von;
        this.bis = bis;
        this.projektNrListe = projektNrListe;
        this.abteilung = abteilung;
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
        this.statusListe = statusListe;
        this.schlagworteFilter = schlagworteFilter;
        this.kategorieFilter = kategorieFilter;
        this.kundenNrListe = kundenNrListe;
        this.suchbegriff = suchbegriff;
        this.modifiedSince = modifiedSince;
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
     * Gets the id value for this FilterProjekteSearchCriteriaType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this FilterProjekteSearchCriteriaType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the von value for this FilterProjekteSearchCriteriaType.
     *
     * @return von   * Das Anfangsdatum des Zeitraums, in dem die zu liefernden Projekte
     * liegen müssen. Format: YYYY-MM-TT.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this FilterProjekteSearchCriteriaType.
     *
     * @param von   * Das Anfangsdatum des Zeitraums, in dem die zu liefernden Projekte
     * liegen müssen. Format: YYYY-MM-TT.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this FilterProjekteSearchCriteriaType.
     *
     * @return bis   * Das Enddatum des Zeitraums, in dem die zu liefernden Projekte
     * liegen müssen. Format: YYYY-MM-TT.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this FilterProjekteSearchCriteriaType.
     *
     * @param bis   * Das Enddatum des Zeitraums, in dem die zu liefernden Projekte
     * liegen müssen. Format: YYYY-MM-TT.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the projektNrListe value for this FilterProjekteSearchCriteriaType.
     *
     * @return projektNrListe   * Liste der Projekt-Nummern der zu berücksichtigenden Projekte.
     */
    public String[] getProjektNrListe() {
        return projektNrListe;
    }

    /**
     * Sets the projektNrListe value for this FilterProjekteSearchCriteriaType.
     *
     * @param projektNrListe   * Liste der Projekt-Nummern der zu berücksichtigenden Projekte.
     */
    public void setProjektNrListe(String[] projektNrListe) {
        this.projektNrListe = projektNrListe;
    }

    /**
     * Gets the abteilung value for this FilterProjekteSearchCriteriaType.
     *
     * @return abteilung   * Die Abteilung, der die zu liefernden Projekte zugeordnet sein
     * müssen.
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this FilterProjekteSearchCriteriaType.
     *
     * @param abteilung   * Die Abteilung, der die zu liefernden Projekte zugeordnet sein
     * müssen.
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the inklusiveUnterabteilung value for this FilterProjekteSearchCriteriaType.
     *
     * @return inklusiveUnterabteilung   * default = false
     */
    public Boolean getInklusiveUnterabteilung() {
        return inklusiveUnterabteilung;
    }

    /**
     * Sets the inklusiveUnterabteilung value for this FilterProjekteSearchCriteriaType.
     *
     * @param inklusiveUnterabteilung   * default = false
     */
    public void setInklusiveUnterabteilung(Boolean inklusiveUnterabteilung) {
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
    }

    /**
     * Gets the statusListe value for this FilterProjekteSearchCriteriaType.
     *
     * @return statusListe   * Der Status der zu liefernden Projekte.
     */
    public String[] getStatusListe() {
        return statusListe;
    }

    /**
     * Sets the statusListe value for this FilterProjekteSearchCriteriaType.
     *
     * @param statusListe   * Der Status der zu liefernden Projekte.
     */
    public void setStatusListe(String[] statusListe) {
        this.statusListe = statusListe;
    }

    /**
     * Gets the schlagworteFilter value for this FilterProjekteSearchCriteriaType.
     *
     * @return schlagworteFilter   * Das Schlagwort kann hier egal in welcher Sprachen eingeben
     * werden. -ohne- oder -without- oder -sans- lieferen Objekte Ohne Schlagworte
     */
    public String[] getSchlagworteFilter() {
        return schlagworteFilter;
    }

    /**
     * Sets the schlagworteFilter value for this FilterProjekteSearchCriteriaType.
     *
     * @param schlagworteFilter   * Das Schlagwort kann hier egal in welcher Sprachen eingeben
     * werden. -ohne- oder -without- oder -sans- lieferen Objekte Ohne Schlagworte
     */
    public void setSchlagworteFilter(String[] schlagworteFilter) {
        this.schlagworteFilter = schlagworteFilter;
    }

    /**
     * Gets the kategorieFilter value for this FilterProjekteSearchCriteriaType.
     *
     * @return kategorieFilter   * -ohne- oder -without- oder -sans- lieferen Objekte Ohne Schlagworte
     */
    public String[] getKategorieFilter() {
        return kategorieFilter;
    }

    /**
     * Sets the kategorieFilter value for this FilterProjekteSearchCriteriaType.
     *
     * @param kategorieFilter   * -ohne- oder -without- oder -sans- lieferen Objekte Ohne Schlagworte
     */
    public void setKategorieFilter(String[] kategorieFilter) {
        this.kategorieFilter = kategorieFilter;
    }

    /**
     * Gets the kundenNrListe value for this FilterProjekteSearchCriteriaType.
     *
     * @return kundenNrListe
     */
    public String[] getKundenNrListe() {
        return kundenNrListe;
    }

    /**
     * Sets the kundenNrListe value for this FilterProjekteSearchCriteriaType.
     *
     * @param kundenNrListe
     */
    public void setKundenNrListe(String[] kundenNrListe) {
        this.kundenNrListe = kundenNrListe;
    }

    /**
     * Gets the suchbegriff value for this FilterProjekteSearchCriteriaType.
     *
     * @return suchbegriff   * Durch den in das Suchfeld eingebebenen Text wird die Ergebnistabelle
     * nach: Kurzform, Bezeichnung,Bemerkung eingeschränkt. Verwenden Sie
     * das %-Zeichen als Platzhalter (wildcard). D.h., mit % können Sie beliebige
     * Wörter/Buchstaben darstellen, die sich zwischen Ihren Suchbegriffen
     * befinden.
     */
    public String getSuchbegriff() {
        return suchbegriff;
    }

    /**
     * Sets the suchbegriff value for this FilterProjekteSearchCriteriaType.
     *
     * @param suchbegriff   * Durch den in das Suchfeld eingebebenen Text wird die Ergebnistabelle
     * nach: Kurzform, Bezeichnung,Bemerkung eingeschränkt. Verwenden Sie
     * das %-Zeichen als Platzhalter (wildcard). D.h., mit % können Sie beliebige
     * Wörter/Buchstaben darstellen, die sich zwischen Ihren Suchbegriffen
     * befinden.
     */
    public void setSuchbegriff(String suchbegriff) {
        this.suchbegriff = suchbegriff;
    }

    /**
     * Gets the modifiedSince value for this FilterProjekteSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this FilterProjekteSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the attributes value for this FilterProjekteSearchCriteriaType.
     *
     * @return attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this FilterProjekteSearchCriteriaType.
     *
     * @param attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FilterProjekteSearchCriteriaType)) return false;
        FilterProjekteSearchCriteriaType other = (FilterProjekteSearchCriteriaType) obj;
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
                ((this.projektNrListe == null && other.getProjektNrListe() == null) ||
                        (this.projektNrListe != null &&
                                java.util.Arrays.equals(this.projektNrListe, other.getProjektNrListe()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.inklusiveUnterabteilung == null && other.getInklusiveUnterabteilung() == null) ||
                        (this.inklusiveUnterabteilung != null &&
                                this.inklusiveUnterabteilung.equals(other.getInklusiveUnterabteilung()))) &&
                ((this.statusListe == null && other.getStatusListe() == null) ||
                        (this.statusListe != null &&
                                java.util.Arrays.equals(this.statusListe, other.getStatusListe()))) &&
                ((this.schlagworteFilter == null && other.getSchlagworteFilter() == null) ||
                        (this.schlagworteFilter != null &&
                                java.util.Arrays.equals(this.schlagworteFilter, other.getSchlagworteFilter()))) &&
                ((this.kategorieFilter == null && other.getKategorieFilter() == null) ||
                        (this.kategorieFilter != null &&
                                java.util.Arrays.equals(this.kategorieFilter, other.getKategorieFilter()))) &&
                ((this.kundenNrListe == null && other.getKundenNrListe() == null) ||
                        (this.kundenNrListe != null &&
                                java.util.Arrays.equals(this.kundenNrListe, other.getKundenNrListe()))) &&
                ((this.suchbegriff == null && other.getSuchbegriff() == null) ||
                        (this.suchbegriff != null &&
                                this.suchbegriff.equals(other.getSuchbegriff()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
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
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getInklusiveUnterabteilung() != null) {
            _hashCode += getInklusiveUnterabteilung().hashCode();
        }
        if (getStatusListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getStatusListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStatusListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getKategorieFilter() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getKategorieFilter());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getKategorieFilter(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKundenNrListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getKundenNrListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getKundenNrListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuchbegriff() != null) {
            _hashCode += getSuchbegriff().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
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

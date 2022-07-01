/**
 * ReadAngebotSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadAngebotSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadAngebotSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAngebotSearchCriteriaType"));
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
        elemField.setFieldName("abteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abteilung"));
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
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bearbeiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bearbeiter"));
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
        elemField.setFieldName("suchbegriff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suchbegriff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String von;
    private String bis;
    private String abteilung;
    private String projektNr;
    private String kundenNr;
    /* 10 = NEU; 20 = IN_BEARBEITUNG; 30 =
     *             					FERTIG; 40 = IN_PRUEFUNG; 50 = GEPRUEFT;
     *             					60 = DOKUMENT_ERSTELLT; 70 =
     *             					ALS_MAIL_ANGEBOTEN; 80 =
     *             					ALS_BRIEF_ANGEBOTEN; 90 = BEAUFTRAGT; 95
     *             					= BESTAETIGT; 100 =
     *             					IN_PROJEKT_UEBERFUEHRT; 110 =
     *             					ABGERECHNET; 200 = ABGELEHNT; */
    private Integer status;
    private String bearbeiter;
    private String[] schlagworteFilter;
    /* Durch den in das Suchfeld eingebebenen
     *             					Text wird die Ergebnistabelle nach: Nr
     *             					Titel Schlagworte Bemerkungen
     *             					eingeschränkt. Verwenden Sie das
     *             					%-Zeichen als Platzhalter (wildcard).
     *             					D.h., mit % können Sie beliebige
     *             					Wörter/Buchstaben darstellen, die sich
     *             					zwischen Ihren Suchbegriffen befinden. */
    private String suchbegriff;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadAngebotSearchCriteriaType() {
    }


    public ReadAngebotSearchCriteriaType(
            String von,
            String bis,
            String abteilung,
            String projektNr,
            String kundenNr,
            Integer status,
            String bearbeiter,
            String[] schlagworteFilter,
            String suchbegriff) {
        this.von = von;
        this.bis = bis;
        this.abteilung = abteilung;
        this.projektNr = projektNr;
        this.kundenNr = kundenNr;
        this.status = status;
        this.bearbeiter = bearbeiter;
        this.schlagworteFilter = schlagworteFilter;
        this.suchbegriff = suchbegriff;
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
     * Gets the von value for this ReadAngebotSearchCriteriaType.
     *
     * @return von
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ReadAngebotSearchCriteriaType.
     *
     * @param von
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ReadAngebotSearchCriteriaType.
     *
     * @return bis
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ReadAngebotSearchCriteriaType.
     *
     * @param bis
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the abteilung value for this ReadAngebotSearchCriteriaType.
     *
     * @return abteilung
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this ReadAngebotSearchCriteriaType.
     *
     * @param abteilung
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the projektNr value for this ReadAngebotSearchCriteriaType.
     *
     * @return projektNr
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ReadAngebotSearchCriteriaType.
     *
     * @param projektNr
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the kundenNr value for this ReadAngebotSearchCriteriaType.
     *
     * @return kundenNr
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this ReadAngebotSearchCriteriaType.
     *
     * @param kundenNr
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the status value for this ReadAngebotSearchCriteriaType.
     *
     * @return status   * 10 = NEU; 20 = IN_BEARBEITUNG; 30 =
     *             					FERTIG; 40 = IN_PRUEFUNG; 50 = GEPRUEFT;
     *             					60 = DOKUMENT_ERSTELLT; 70 =
     *             					ALS_MAIL_ANGEBOTEN; 80 =
     *             					ALS_BRIEF_ANGEBOTEN; 90 = BEAUFTRAGT; 95
     *             					= BESTAETIGT; 100 =
     *             					IN_PROJEKT_UEBERFUEHRT; 110 =
     *             					ABGERECHNET; 200 = ABGELEHNT;
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the status value for this ReadAngebotSearchCriteriaType.
     *
     * @param status   * 10 = NEU; 20 = IN_BEARBEITUNG; 30 =
     *             					FERTIG; 40 = IN_PRUEFUNG; 50 = GEPRUEFT;
     *             					60 = DOKUMENT_ERSTELLT; 70 =
     *             					ALS_MAIL_ANGEBOTEN; 80 =
     *             					ALS_BRIEF_ANGEBOTEN; 90 = BEAUFTRAGT; 95
     *             					= BESTAETIGT; 100 =
     *             					IN_PROJEKT_UEBERFUEHRT; 110 =
     *             					ABGERECHNET; 200 = ABGELEHNT;
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets the bearbeiter value for this ReadAngebotSearchCriteriaType.
     *
     * @return bearbeiter
     */
    public String getBearbeiter() {
        return bearbeiter;
    }

    /**
     * Sets the bearbeiter value for this ReadAngebotSearchCriteriaType.
     *
     * @param bearbeiter
     */
    public void setBearbeiter(String bearbeiter) {
        this.bearbeiter = bearbeiter;
    }

    /**
     * Gets the schlagworteFilter value for this ReadAngebotSearchCriteriaType.
     *
     * @return schlagworteFilter
     */
    public String[] getSchlagworteFilter() {
        return schlagworteFilter;
    }

    /**
     * Sets the schlagworteFilter value for this ReadAngebotSearchCriteriaType.
     *
     * @param schlagworteFilter
     */
    public void setSchlagworteFilter(String[] schlagworteFilter) {
        this.schlagworteFilter = schlagworteFilter;
    }

    /**
     * Gets the suchbegriff value for this ReadAngebotSearchCriteriaType.
     *
     * @return suchbegriff   * Durch den in das Suchfeld eingebebenen
     *             					Text wird die Ergebnistabelle nach: Nr
     *             					Titel Schlagworte Bemerkungen
     *             					eingeschränkt. Verwenden Sie das
     *             					%-Zeichen als Platzhalter (wildcard).
     *             					D.h., mit % können Sie beliebige
     *             					Wörter/Buchstaben darstellen, die sich
     *             					zwischen Ihren Suchbegriffen befinden.
     */
    public String getSuchbegriff() {
        return suchbegriff;
    }

    /**
     * Sets the suchbegriff value for this ReadAngebotSearchCriteriaType.
     *
     * @param suchbegriff   * Durch den in das Suchfeld eingebebenen
     *             					Text wird die Ergebnistabelle nach: Nr
     *             					Titel Schlagworte Bemerkungen
     *             					eingeschränkt. Verwenden Sie das
     *             					%-Zeichen als Platzhalter (wildcard).
     *             					D.h., mit % können Sie beliebige
     *             					Wörter/Buchstaben darstellen, die sich
     *             					zwischen Ihren Suchbegriffen befinden.
     */
    public void setSuchbegriff(String suchbegriff) {
        this.suchbegriff = suchbegriff;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadAngebotSearchCriteriaType)) return false;
        ReadAngebotSearchCriteriaType other = (ReadAngebotSearchCriteriaType) obj;
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
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.bearbeiter == null && other.getBearbeiter() == null) ||
                        (this.bearbeiter != null &&
                                this.bearbeiter.equals(other.getBearbeiter()))) &&
                ((this.schlagworteFilter == null && other.getSchlagworteFilter() == null) ||
                        (this.schlagworteFilter != null &&
                                java.util.Arrays.equals(this.schlagworteFilter, other.getSchlagworteFilter()))) &&
                ((this.suchbegriff == null && other.getSuchbegriff() == null) ||
                        (this.suchbegriff != null &&
                                this.suchbegriff.equals(other.getSuchbegriff())));
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
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getBearbeiter() != null) {
            _hashCode += getBearbeiter().hashCode();
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
        if (getSuchbegriff() != null) {
            _hashCode += getSuchbegriff().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

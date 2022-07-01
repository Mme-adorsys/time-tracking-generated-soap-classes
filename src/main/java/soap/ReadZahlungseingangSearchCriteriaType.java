/**
 * ReadZahlungseingangSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadZahlungseingangSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadZahlungseingangSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadZahlungseingangSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNrListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNrListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "projektNr"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektsabteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektsabteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inklProjektsunterabteilungen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inklProjektsunterabteilungen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("waehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waehrung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inBasiswaehrungUmrechnen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inBasiswaehrungUmrechnen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("kundenabteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenabteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inklKundenunterabteilungen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inklKundenunterabteilungen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String[] projektNrListe;
    private String projektsabteilung;
    private Boolean inklProjektsunterabteilungen;
    private String von;
    private String bis;
    private String waehrung;
    /* Default = true */
    private Boolean inBasiswaehrungUmrechnen;
    private String kundenNr;
    private String kundenabteilung;
    private Boolean inklKundenunterabteilungen;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadZahlungseingangSearchCriteriaType() {
    }


    public ReadZahlungseingangSearchCriteriaType(
            String[] projektNrListe,
            String projektsabteilung,
            Boolean inklProjektsunterabteilungen,
            String von,
            String bis,
            String waehrung,
            Boolean inBasiswaehrungUmrechnen,
            String kundenNr,
            String kundenabteilung,
            Boolean inklKundenunterabteilungen) {
        this.projektNrListe = projektNrListe;
        this.projektsabteilung = projektsabteilung;
        this.inklProjektsunterabteilungen = inklProjektsunterabteilungen;
        this.von = von;
        this.bis = bis;
        this.waehrung = waehrung;
        this.inBasiswaehrungUmrechnen = inBasiswaehrungUmrechnen;
        this.kundenNr = kundenNr;
        this.kundenabteilung = kundenabteilung;
        this.inklKundenunterabteilungen = inklKundenunterabteilungen;
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
     * Gets the projektNrListe value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return projektNrListe
     */
    public String[] getProjektNrListe() {
        return projektNrListe;
    }

    /**
     * Sets the projektNrListe value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param projektNrListe
     */
    public void setProjektNrListe(String[] projektNrListe) {
        this.projektNrListe = projektNrListe;
    }

    /**
     * Gets the projektsabteilung value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return projektsabteilung
     */
    public String getProjektsabteilung() {
        return projektsabteilung;
    }

    /**
     * Sets the projektsabteilung value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param projektsabteilung
     */
    public void setProjektsabteilung(String projektsabteilung) {
        this.projektsabteilung = projektsabteilung;
    }

    /**
     * Gets the inklProjektsunterabteilungen value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return inklProjektsunterabteilungen
     */
    public Boolean getInklProjektsunterabteilungen() {
        return inklProjektsunterabteilungen;
    }

    /**
     * Sets the inklProjektsunterabteilungen value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param inklProjektsunterabteilungen
     */
    public void setInklProjektsunterabteilungen(Boolean inklProjektsunterabteilungen) {
        this.inklProjektsunterabteilungen = inklProjektsunterabteilungen;
    }

    /**
     * Gets the von value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return von
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param von
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return bis
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param bis
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the waehrung value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return waehrung
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param waehrung
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the inBasiswaehrungUmrechnen value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return inBasiswaehrungUmrechnen   * Default = true
     */
    public Boolean getInBasiswaehrungUmrechnen() {
        return inBasiswaehrungUmrechnen;
    }

    /**
     * Sets the inBasiswaehrungUmrechnen value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param inBasiswaehrungUmrechnen   * Default = true
     */
    public void setInBasiswaehrungUmrechnen(Boolean inBasiswaehrungUmrechnen) {
        this.inBasiswaehrungUmrechnen = inBasiswaehrungUmrechnen;
    }

    /**
     * Gets the kundenNr value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return kundenNr
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param kundenNr
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the kundenabteilung value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return kundenabteilung
     */
    public String getKundenabteilung() {
        return kundenabteilung;
    }

    /**
     * Sets the kundenabteilung value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param kundenabteilung
     */
    public void setKundenabteilung(String kundenabteilung) {
        this.kundenabteilung = kundenabteilung;
    }

    /**
     * Gets the inklKundenunterabteilungen value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @return inklKundenunterabteilungen
     */
    public Boolean getInklKundenunterabteilungen() {
        return inklKundenunterabteilungen;
    }

    /**
     * Sets the inklKundenunterabteilungen value for this ReadZahlungseingangSearchCriteriaType.
     *
     * @param inklKundenunterabteilungen
     */
    public void setInklKundenunterabteilungen(Boolean inklKundenunterabteilungen) {
        this.inklKundenunterabteilungen = inklKundenunterabteilungen;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadZahlungseingangSearchCriteriaType)) return false;
        ReadZahlungseingangSearchCriteriaType other = (ReadZahlungseingangSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.projektNrListe == null && other.getProjektNrListe() == null) ||
                        (this.projektNrListe != null &&
                                java.util.Arrays.equals(this.projektNrListe, other.getProjektNrListe()))) &&
                ((this.projektsabteilung == null && other.getProjektsabteilung() == null) ||
                        (this.projektsabteilung != null &&
                                this.projektsabteilung.equals(other.getProjektsabteilung()))) &&
                ((this.inklProjektsunterabteilungen == null && other.getInklProjektsunterabteilungen() == null) ||
                        (this.inklProjektsunterabteilungen != null &&
                                this.inklProjektsunterabteilungen.equals(other.getInklProjektsunterabteilungen()))) &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.inBasiswaehrungUmrechnen == null && other.getInBasiswaehrungUmrechnen() == null) ||
                        (this.inBasiswaehrungUmrechnen != null &&
                                this.inBasiswaehrungUmrechnen.equals(other.getInBasiswaehrungUmrechnen()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.kundenabteilung == null && other.getKundenabteilung() == null) ||
                        (this.kundenabteilung != null &&
                                this.kundenabteilung.equals(other.getKundenabteilung()))) &&
                ((this.inklKundenunterabteilungen == null && other.getInklKundenunterabteilungen() == null) ||
                        (this.inklKundenunterabteilungen != null &&
                                this.inklKundenunterabteilungen.equals(other.getInklKundenunterabteilungen())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
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
        if (getProjektsabteilung() != null) {
            _hashCode += getProjektsabteilung().hashCode();
        }
        if (getInklProjektsunterabteilungen() != null) {
            _hashCode += getInklProjektsunterabteilungen().hashCode();
        }
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getInBasiswaehrungUmrechnen() != null) {
            _hashCode += getInBasiswaehrungUmrechnen().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getKundenabteilung() != null) {
            _hashCode += getKundenabteilung().hashCode();
        }
        if (getInklKundenunterabteilungen() != null) {
            _hashCode += getInklKundenunterabteilungen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

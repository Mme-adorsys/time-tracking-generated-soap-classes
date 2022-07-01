/**
 * AbteilungType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter einer Abteilung.
 */
public class AbteilungType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AbteilungType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AbteilungType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("waehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waehrung"));
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
        elemField.setFieldName("rechnungsnummerPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungsnummerPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungsnummerSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungsnummerSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungsnummerLaenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungsnummerLaenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("abteilungsleiterListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abteilungsleiterListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AbteilungsleiterListeType"));
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
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private Integer id;
    /* Die Kurzbezeichnung der Abteilung. */
    private String kurzform;
    /* Die Bezeichnung der Abteilung. */
    private String bezeichnung;
    /* Die Währung der Abteilung. */
    private String waehrung;
    /* Kennung, ob die Abteilung aktiv oder inaktiv ist. */
    private Boolean inaktiv;
    /* Der Präfix des Rechnungsnummernkreises dieser Abteilung für
     * die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen in
     * der Administration abhängig. */
    private String rechnungsnummerPrefix;
    /* Der Suffix des Rechnungsnummernkreises dieser Abteilung für
     * die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen in
     * der Administration abhängig. */
    private String rechnungsnummerSuffix;
    /* Die Stelelnanzahlen der Nummerirung im Rechnungsnummernkreis
     * dieser Abteilung für die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen
     * in der Administration abhängig. */
    private Integer rechnungsnummerLaenge;
    /* Die übergeorndete Abteilung. */
    private String oberAbteilung;
    private AbteilungsleiterListeType abteilungsleiterListe;
    private Integer parentId;
    private String bemerkung;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AbteilungType() {
    }


    public AbteilungType(
            Integer id,
            String kurzform,
            String bezeichnung,
            String waehrung,
            Boolean inaktiv,
            String rechnungsnummerPrefix,
            String rechnungsnummerSuffix,
            Integer rechnungsnummerLaenge,
            String oberAbteilung,
            AbteilungsleiterListeType abteilungsleiterListe,
            Integer parentId,
            String bemerkung) {
        this.id = id;
        this.kurzform = kurzform;
        this.bezeichnung = bezeichnung;
        this.waehrung = waehrung;
        this.inaktiv = inaktiv;
        this.rechnungsnummerPrefix = rechnungsnummerPrefix;
        this.rechnungsnummerSuffix = rechnungsnummerSuffix;
        this.rechnungsnummerLaenge = rechnungsnummerLaenge;
        this.oberAbteilung = oberAbteilung;
        this.abteilungsleiterListe = abteilungsleiterListe;
        this.parentId = parentId;
        this.bemerkung = bemerkung;
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
     * Gets the id value for this AbteilungType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this AbteilungType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the kurzform value for this AbteilungType.
     *
     * @return kurzform   * Die Kurzbezeichnung der Abteilung.
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Sets the kurzform value for this AbteilungType.
     *
     * @param kurzform   * Die Kurzbezeichnung der Abteilung.
     */
    public void setKurzform(String kurzform) {
        this.kurzform = kurzform;
    }

    /**
     * Gets the bezeichnung value for this AbteilungType.
     *
     * @return bezeichnung   * Die Bezeichnung der Abteilung.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this AbteilungType.
     *
     * @param bezeichnung   * Die Bezeichnung der Abteilung.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the waehrung value for this AbteilungType.
     *
     * @return waehrung   * Die Währung der Abteilung.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this AbteilungType.
     *
     * @param waehrung   * Die Währung der Abteilung.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the inaktiv value for this AbteilungType.
     *
     * @return inaktiv   * Kennung, ob die Abteilung aktiv oder inaktiv ist.
     */
    public Boolean getInaktiv() {
        return inaktiv;
    }

    /**
     * Sets the inaktiv value for this AbteilungType.
     *
     * @param inaktiv   * Kennung, ob die Abteilung aktiv oder inaktiv ist.
     */
    public void setInaktiv(Boolean inaktiv) {
        this.inaktiv = inaktiv;
    }

    /**
     * Gets the rechnungsnummerPrefix value for this AbteilungType.
     *
     * @return rechnungsnummerPrefix   * Der Präfix des Rechnungsnummernkreises dieser Abteilung für
     * die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen in
     * der Administration abhängig.
     */
    public String getRechnungsnummerPrefix() {
        return rechnungsnummerPrefix;
    }

    /**
     * Sets the rechnungsnummerPrefix value for this AbteilungType.
     *
     * @param rechnungsnummerPrefix   * Der Präfix des Rechnungsnummernkreises dieser Abteilung für
     * die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen in
     * der Administration abhängig.
     */
    public void setRechnungsnummerPrefix(String rechnungsnummerPrefix) {
        this.rechnungsnummerPrefix = rechnungsnummerPrefix;
    }

    /**
     * Gets the rechnungsnummerSuffix value for this AbteilungType.
     *
     * @return rechnungsnummerSuffix   * Der Suffix des Rechnungsnummernkreises dieser Abteilung für
     * die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen in
     * der Administration abhängig.
     */
    public String getRechnungsnummerSuffix() {
        return rechnungsnummerSuffix;
    }

    /**
     * Sets the rechnungsnummerSuffix value for this AbteilungType.
     *
     * @param rechnungsnummerSuffix   * Der Suffix des Rechnungsnummernkreises dieser Abteilung für
     * die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen in
     * der Administration abhängig.
     */
    public void setRechnungsnummerSuffix(String rechnungsnummerSuffix) {
        this.rechnungsnummerSuffix = rechnungsnummerSuffix;
    }

    /**
     * Gets the rechnungsnummerLaenge value for this AbteilungType.
     *
     * @return rechnungsnummerLaenge   * Die Stelelnanzahlen der Nummerirung im Rechnungsnummernkreis
     * dieser Abteilung für die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen
     * in der Administration abhängig.
     */
    public Integer getRechnungsnummerLaenge() {
        return rechnungsnummerLaenge;
    }

    /**
     * Sets the rechnungsnummerLaenge value for this AbteilungType.
     *
     * @param rechnungsnummerLaenge   * Die Stelelnanzahlen der Nummerirung im Rechnungsnummernkreis
     * dieser Abteilung für die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen
     * in der Administration abhängig.
     */
    public void setRechnungsnummerLaenge(Integer rechnungsnummerLaenge) {
        this.rechnungsnummerLaenge = rechnungsnummerLaenge;
    }

    /**
     * Gets the oberAbteilung value for this AbteilungType.
     *
     * @return oberAbteilung   * Die übergeorndete Abteilung.
     */
    public String getOberAbteilung() {
        return oberAbteilung;
    }

    /**
     * Sets the oberAbteilung value for this AbteilungType.
     *
     * @param oberAbteilung   * Die übergeorndete Abteilung.
     */
    public void setOberAbteilung(String oberAbteilung) {
        this.oberAbteilung = oberAbteilung;
    }

    /**
     * Gets the abteilungsleiterListe value for this AbteilungType.
     *
     * @return abteilungsleiterListe
     */
    public AbteilungsleiterListeType getAbteilungsleiterListe() {
        return abteilungsleiterListe;
    }

    /**
     * Sets the abteilungsleiterListe value for this AbteilungType.
     *
     * @param abteilungsleiterListe
     */
    public void setAbteilungsleiterListe(AbteilungsleiterListeType abteilungsleiterListe) {
        this.abteilungsleiterListe = abteilungsleiterListe;
    }

    /**
     * Gets the parentId value for this AbteilungType.
     *
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Sets the parentId value for this AbteilungType.
     *
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets the bemerkung value for this AbteilungType.
     *
     * @return bemerkung
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this AbteilungType.
     *
     * @param bemerkung
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AbteilungType)) return false;
        AbteilungType other = (AbteilungType) obj;
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
                ((this.kurzform == null && other.getKurzform() == null) ||
                        (this.kurzform != null &&
                                this.kurzform.equals(other.getKurzform()))) &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.inaktiv == null && other.getInaktiv() == null) ||
                        (this.inaktiv != null &&
                                this.inaktiv.equals(other.getInaktiv()))) &&
                ((this.rechnungsnummerPrefix == null && other.getRechnungsnummerPrefix() == null) ||
                        (this.rechnungsnummerPrefix != null &&
                                this.rechnungsnummerPrefix.equals(other.getRechnungsnummerPrefix()))) &&
                ((this.rechnungsnummerSuffix == null && other.getRechnungsnummerSuffix() == null) ||
                        (this.rechnungsnummerSuffix != null &&
                                this.rechnungsnummerSuffix.equals(other.getRechnungsnummerSuffix()))) &&
                ((this.rechnungsnummerLaenge == null && other.getRechnungsnummerLaenge() == null) ||
                        (this.rechnungsnummerLaenge != null &&
                                this.rechnungsnummerLaenge.equals(other.getRechnungsnummerLaenge()))) &&
                ((this.oberAbteilung == null && other.getOberAbteilung() == null) ||
                        (this.oberAbteilung != null &&
                                this.oberAbteilung.equals(other.getOberAbteilung()))) &&
                ((this.abteilungsleiterListe == null && other.getAbteilungsleiterListe() == null) ||
                        (this.abteilungsleiterListe != null &&
                                this.abteilungsleiterListe.equals(other.getAbteilungsleiterListe()))) &&
                ((this.parentId == null && other.getParentId() == null) ||
                        (this.parentId != null &&
                                this.parentId.equals(other.getParentId()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung())));
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
        if (getKurzform() != null) {
            _hashCode += getKurzform().hashCode();
        }
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getInaktiv() != null) {
            _hashCode += getInaktiv().hashCode();
        }
        if (getRechnungsnummerPrefix() != null) {
            _hashCode += getRechnungsnummerPrefix().hashCode();
        }
        if (getRechnungsnummerSuffix() != null) {
            _hashCode += getRechnungsnummerSuffix().hashCode();
        }
        if (getRechnungsnummerLaenge() != null) {
            _hashCode += getRechnungsnummerLaenge().hashCode();
        }
        if (getOberAbteilung() != null) {
            _hashCode += getOberAbteilung().hashCode();
        }
        if (getAbteilungsleiterListe() != null) {
            _hashCode += getAbteilungsleiterListe().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

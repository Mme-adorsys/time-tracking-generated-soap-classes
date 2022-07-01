/**
 * TerminType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class TerminType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TerminType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TerminType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titel"));
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
        elemField.setFieldName("ort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anzeigenAls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anzeigenAls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sichtbarkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sichtbarkeit"));
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
        elemField.setFieldName("beschreibung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beschreibung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gaeste");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gaeste"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "EmailListeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wiederholung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wiederholung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TerminWiederholungType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* userid des Eigentümers */
    private String userId;
    private String titel;
    private String von;
    private String bis;
    private String ort;
    /* 0 oder leer = als beschäftigt; 1 = als
     *             					verfügbar */
    private Integer anzeigenAls;
    /* PUBLIC = öffentlich; CONFIDENTIAL = nur
     *             					Zeit und Datum; PRIVATE = privat;
     *             					Default ist PUBLIC. */
    private String sichtbarkeit;
    private String projektNr;
    private String beschreibung;
    private EmailListeType gaeste;
    private TerminWiederholungType wiederholung;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TerminType() {
    }


    public TerminType(
            String userId,
            String titel,
            String von,
            String bis,
            String ort,
            Integer anzeigenAls,
            String sichtbarkeit,
            String projektNr,
            String beschreibung,
            EmailListeType gaeste,
            TerminWiederholungType wiederholung) {
        this.userId = userId;
        this.titel = titel;
        this.von = von;
        this.bis = bis;
        this.ort = ort;
        this.anzeigenAls = anzeigenAls;
        this.sichtbarkeit = sichtbarkeit;
        this.projektNr = projektNr;
        this.beschreibung = beschreibung;
        this.gaeste = gaeste;
        this.wiederholung = wiederholung;
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
     * Gets the userId value for this TerminType.
     *
     * @return userId   * userid des Eigentümers
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this TerminType.
     *
     * @param userId   * userid des Eigentümers
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the titel value for this TerminType.
     *
     * @return titel
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the titel value for this TerminType.
     *
     * @param titel
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * Gets the von value for this TerminType.
     *
     * @return von
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this TerminType.
     *
     * @param von
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this TerminType.
     *
     * @return bis
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this TerminType.
     *
     * @param bis
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the ort value for this TerminType.
     *
     * @return ort
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the ort value for this TerminType.
     *
     * @param ort
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * Gets the anzeigenAls value for this TerminType.
     *
     * @return anzeigenAls   * 0 oder leer = als beschäftigt; 1 = als
     *             					verfügbar
     */
    public Integer getAnzeigenAls() {
        return anzeigenAls;
    }

    /**
     * Sets the anzeigenAls value for this TerminType.
     *
     * @param anzeigenAls   * 0 oder leer = als beschäftigt; 1 = als
     *             					verfügbar
     */
    public void setAnzeigenAls(Integer anzeigenAls) {
        this.anzeigenAls = anzeigenAls;
    }

    /**
     * Gets the sichtbarkeit value for this TerminType.
     *
     * @return sichtbarkeit   * PUBLIC = öffentlich; CONFIDENTIAL = nur
     *             					Zeit und Datum; PRIVATE = privat;
     *             					Default ist PUBLIC.
     */
    public String getSichtbarkeit() {
        return sichtbarkeit;
    }

    /**
     * Sets the sichtbarkeit value for this TerminType.
     *
     * @param sichtbarkeit   * PUBLIC = öffentlich; CONFIDENTIAL = nur
     *             					Zeit und Datum; PRIVATE = privat;
     *             					Default ist PUBLIC.
     */
    public void setSichtbarkeit(String sichtbarkeit) {
        this.sichtbarkeit = sichtbarkeit;
    }

    /**
     * Gets the projektNr value for this TerminType.
     *
     * @return projektNr
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this TerminType.
     *
     * @param projektNr
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the beschreibung value for this TerminType.
     *
     * @return beschreibung
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the beschreibung value for this TerminType.
     *
     * @param beschreibung
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Gets the gaeste value for this TerminType.
     *
     * @return gaeste
     */
    public EmailListeType getGaeste() {
        return gaeste;
    }

    /**
     * Sets the gaeste value for this TerminType.
     *
     * @param gaeste
     */
    public void setGaeste(EmailListeType gaeste) {
        this.gaeste = gaeste;
    }

    /**
     * Gets the wiederholung value for this TerminType.
     *
     * @return wiederholung
     */
    public TerminWiederholungType getWiederholung() {
        return wiederholung;
    }

    /**
     * Sets the wiederholung value for this TerminType.
     *
     * @param wiederholung
     */
    public void setWiederholung(TerminWiederholungType wiederholung) {
        this.wiederholung = wiederholung;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TerminType)) return false;
        TerminType other = (TerminType) obj;
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
                ((this.titel == null && other.getTitel() == null) ||
                        (this.titel != null &&
                                this.titel.equals(other.getTitel()))) &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.ort == null && other.getOrt() == null) ||
                        (this.ort != null &&
                                this.ort.equals(other.getOrt()))) &&
                ((this.anzeigenAls == null && other.getAnzeigenAls() == null) ||
                        (this.anzeigenAls != null &&
                                this.anzeigenAls.equals(other.getAnzeigenAls()))) &&
                ((this.sichtbarkeit == null && other.getSichtbarkeit() == null) ||
                        (this.sichtbarkeit != null &&
                                this.sichtbarkeit.equals(other.getSichtbarkeit()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.beschreibung == null && other.getBeschreibung() == null) ||
                        (this.beschreibung != null &&
                                this.beschreibung.equals(other.getBeschreibung()))) &&
                ((this.gaeste == null && other.getGaeste() == null) ||
                        (this.gaeste != null &&
                                this.gaeste.equals(other.getGaeste()))) &&
                ((this.wiederholung == null && other.getWiederholung() == null) ||
                        (this.wiederholung != null &&
                                this.wiederholung.equals(other.getWiederholung())));
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
        if (getTitel() != null) {
            _hashCode += getTitel().hashCode();
        }
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getOrt() != null) {
            _hashCode += getOrt().hashCode();
        }
        if (getAnzeigenAls() != null) {
            _hashCode += getAnzeigenAls().hashCode();
        }
        if (getSichtbarkeit() != null) {
            _hashCode += getSichtbarkeit().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getBeschreibung() != null) {
            _hashCode += getBeschreibung().hashCode();
        }
        if (getGaeste() != null) {
            _hashCode += getGaeste().hashCode();
        }
        if (getWiederholung() != null) {
            _hashCode += getWiederholung().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

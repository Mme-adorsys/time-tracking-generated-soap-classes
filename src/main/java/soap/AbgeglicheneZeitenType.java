/**
 * AbgeglicheneZeitenType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Informationen zu einem Zeitabgleich.
 */
public class AbgeglicheneZeitenType implements java.io.Serializable {
    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AbgeglicheneZeitenType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AbgeglicheneZeitenType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jahr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jahr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abgeglicheneUeberstunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abgeglicheneUeberstunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abgeglicheneUrlaubstage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abgeglicheneUrlaubstage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verfalleneUrlaubstage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verfalleneUrlaubstage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der User, für dens die abgeglichenen Zeiten gelten. */
    private String userId;
    /* Der Monat, für den die abgeglichenen Zeiten gelten. */
    private int monat;
    /* Das Jahr für das die abgeglichenen Zeiten gelten. */
    private int jahr;
    /* Anzahl der abgeglichenen Überstunden. */
    private Double abgeglicheneUeberstunden;
    /* Anzahl der abgeglichenen Urlaubstage. */
    private Double abgeglicheneUrlaubstage;
    /* Die Bemerkung zu den abgeglichenen Zeiten. */
    private String bemerkung;
    /* Wird nur beim Lesen zurückgeliefert. Beim Anlegen oder Bearbeiten
     * der abgeglichene Zeiten via SOAP wird ignoriert. */
    private Double verfalleneUrlaubstage;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AbgeglicheneZeitenType() {
    }


    public AbgeglicheneZeitenType(
            String userId,
            int monat,
            int jahr,
            Double abgeglicheneUeberstunden,
            Double abgeglicheneUrlaubstage,
            String bemerkung,
            Double verfalleneUrlaubstage) {
        this.userId = userId;
        this.monat = monat;
        this.jahr = jahr;
        this.abgeglicheneUeberstunden = abgeglicheneUeberstunden;
        this.abgeglicheneUrlaubstage = abgeglicheneUrlaubstage;
        this.bemerkung = bemerkung;
        this.verfalleneUrlaubstage = verfalleneUrlaubstage;
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
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the userId value for this AbgeglicheneZeitenType.
     *
     * @return userId   * Der User, für dens die abgeglichenen Zeiten gelten.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this AbgeglicheneZeitenType.
     *
     * @param userId   * Der User, für dens die abgeglichenen Zeiten gelten.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the monat value for this AbgeglicheneZeitenType.
     *
     * @return monat   * Der Monat, für den die abgeglichenen Zeiten gelten.
     */
    public int getMonat() {
        return monat;
    }

    /**
     * Sets the monat value for this AbgeglicheneZeitenType.
     *
     * @param monat   * Der Monat, für den die abgeglichenen Zeiten gelten.
     */
    public void setMonat(int monat) {
        this.monat = monat;
    }

    /**
     * Gets the jahr value for this AbgeglicheneZeitenType.
     *
     * @return jahr   * Das Jahr für das die abgeglichenen Zeiten gelten.
     */
    public int getJahr() {
        return jahr;
    }

    /**
     * Sets the jahr value for this AbgeglicheneZeitenType.
     *
     * @param jahr   * Das Jahr für das die abgeglichenen Zeiten gelten.
     */
    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    /**
     * Gets the abgeglicheneUeberstunden value for this AbgeglicheneZeitenType.
     *
     * @return abgeglicheneUeberstunden   * Anzahl der abgeglichenen Überstunden.
     */
    public Double getAbgeglicheneUeberstunden() {
        return abgeglicheneUeberstunden;
    }

    /**
     * Sets the abgeglicheneUeberstunden value for this AbgeglicheneZeitenType.
     *
     * @param abgeglicheneUeberstunden   * Anzahl der abgeglichenen Überstunden.
     */
    public void setAbgeglicheneUeberstunden(Double abgeglicheneUeberstunden) {
        this.abgeglicheneUeberstunden = abgeglicheneUeberstunden;
    }

    /**
     * Gets the abgeglicheneUrlaubstage value for this AbgeglicheneZeitenType.
     *
     * @return abgeglicheneUrlaubstage   * Anzahl der abgeglichenen Urlaubstage.
     */
    public Double getAbgeglicheneUrlaubstage() {
        return abgeglicheneUrlaubstage;
    }

    /**
     * Sets the abgeglicheneUrlaubstage value for this AbgeglicheneZeitenType.
     *
     * @param abgeglicheneUrlaubstage   * Anzahl der abgeglichenen Urlaubstage.
     */
    public void setAbgeglicheneUrlaubstage(Double abgeglicheneUrlaubstage) {
        this.abgeglicheneUrlaubstage = abgeglicheneUrlaubstage;
    }

    /**
     * Gets the bemerkung value for this AbgeglicheneZeitenType.
     *
     * @return bemerkung   * Die Bemerkung zu den abgeglichenen Zeiten.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this AbgeglicheneZeitenType.
     *
     * @param bemerkung   * Die Bemerkung zu den abgeglichenen Zeiten.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the verfalleneUrlaubstage value for this AbgeglicheneZeitenType.
     *
     * @return verfalleneUrlaubstage   * Wird nur beim Lesen zurückgeliefert. Beim Anlegen oder Bearbeiten
     * der abgeglichene Zeiten via SOAP wird ignoriert.
     */
    public Double getVerfalleneUrlaubstage() {
        return verfalleneUrlaubstage;
    }

    /**
     * Sets the verfalleneUrlaubstage value for this AbgeglicheneZeitenType.
     *
     * @param verfalleneUrlaubstage   * Wird nur beim Lesen zurückgeliefert. Beim Anlegen oder Bearbeiten
     * der abgeglichene Zeiten via SOAP wird ignoriert.
     */
    public void setVerfalleneUrlaubstage(Double verfalleneUrlaubstage) {
        this.verfalleneUrlaubstage = verfalleneUrlaubstage;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AbgeglicheneZeitenType)) return false;
        AbgeglicheneZeitenType other = (AbgeglicheneZeitenType) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.userId == null && other.getUserId() == null) ||
                (this.userId != null &&
                        this.userId.equals(other.getUserId()))) &&
                this.monat == other.getMonat() &&
                this.jahr == other.getJahr() &&
                ((this.abgeglicheneUeberstunden == null && other.getAbgeglicheneUeberstunden() == null) ||
                        (this.abgeglicheneUeberstunden != null &&
                                this.abgeglicheneUeberstunden.equals(other.getAbgeglicheneUeberstunden()))) &&
                ((this.abgeglicheneUrlaubstage == null && other.getAbgeglicheneUrlaubstage() == null) ||
                        (this.abgeglicheneUrlaubstage != null &&
                                this.abgeglicheneUrlaubstage.equals(other.getAbgeglicheneUrlaubstage()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.verfalleneUrlaubstage == null && other.getVerfalleneUrlaubstage() == null) ||
                        (this.verfalleneUrlaubstage != null &&
                                this.verfalleneUrlaubstage.equals(other.getVerfalleneUrlaubstage())));
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
        _hashCode += getMonat();
        _hashCode += getJahr();
        if (getAbgeglicheneUeberstunden() != null) {
            _hashCode += getAbgeglicheneUeberstunden().hashCode();
        }
        if (getAbgeglicheneUrlaubstage() != null) {
            _hashCode += getAbgeglicheneUrlaubstage().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getVerfalleneUrlaubstage() != null) {
            _hashCode += getVerfalleneUrlaubstage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

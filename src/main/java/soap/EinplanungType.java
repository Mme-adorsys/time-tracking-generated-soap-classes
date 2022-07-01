/**
 * EinplanungType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Daten einer Einplanung.
 */
public class EinplanungType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(EinplanungType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "EinplanungType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("anzahlStunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anzahlStunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prozentDerVerfuegbarkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prozentDerVerfuegbarkeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vonZeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vonZeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bisZeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bisZeit"));
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
    }

    private Integer id;
    private String datum;
    private String userId;
    private String projektNr;
    private String kundenNr;
    /* entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein */
    private Double anzahlStunden;
    /* entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein */
    private Double prozentDerVerfuegbarkeit;
    /* entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein */
    private String vonZeit;
    /* entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein */
    private String bisZeit;
    private Integer projektId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public EinplanungType() {
    }


    public EinplanungType(
            Integer id,
            String datum,
            String userId,
            String projektNr,
            String kundenNr,
            Double anzahlStunden,
            Double prozentDerVerfuegbarkeit,
            String vonZeit,
            String bisZeit,
            Integer projektId) {
        this.id = id;
        this.datum = datum;
        this.userId = userId;
        this.projektNr = projektNr;
        this.kundenNr = kundenNr;
        this.anzahlStunden = anzahlStunden;
        this.prozentDerVerfuegbarkeit = prozentDerVerfuegbarkeit;
        this.vonZeit = vonZeit;
        this.bisZeit = bisZeit;
        this.projektId = projektId;
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
     * Gets the id value for this EinplanungType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this EinplanungType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the datum value for this EinplanungType.
     *
     * @return datum
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this EinplanungType.
     *
     * @param datum
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the userId value for this EinplanungType.
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this EinplanungType.
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the projektNr value for this EinplanungType.
     *
     * @return projektNr
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this EinplanungType.
     *
     * @param projektNr
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the kundenNr value for this EinplanungType.
     *
     * @return kundenNr
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this EinplanungType.
     *
     * @param kundenNr
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the anzahlStunden value for this EinplanungType.
     *
     * @return anzahlStunden   * entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein
     */
    public Double getAnzahlStunden() {
        return anzahlStunden;
    }

    /**
     * Sets the anzahlStunden value for this EinplanungType.
     *
     * @param anzahlStunden   * entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein
     */
    public void setAnzahlStunden(Double anzahlStunden) {
        this.anzahlStunden = anzahlStunden;
    }

    /**
     * Gets the prozentDerVerfuegbarkeit value for this EinplanungType.
     *
     * @return prozentDerVerfuegbarkeit   * entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein
     */
    public Double getProzentDerVerfuegbarkeit() {
        return prozentDerVerfuegbarkeit;
    }

    /**
     * Sets the prozentDerVerfuegbarkeit value for this EinplanungType.
     *
     * @param prozentDerVerfuegbarkeit   * entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein
     */
    public void setProzentDerVerfuegbarkeit(Double prozentDerVerfuegbarkeit) {
        this.prozentDerVerfuegbarkeit = prozentDerVerfuegbarkeit;
    }

    /**
     * Gets the vonZeit value for this EinplanungType.
     *
     * @return vonZeit   * entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein
     */
    public String getVonZeit() {
        return vonZeit;
    }

    /**
     * Sets the vonZeit value for this EinplanungType.
     *
     * @param vonZeit   * entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein
     */
    public void setVonZeit(String vonZeit) {
        this.vonZeit = vonZeit;
    }

    /**
     * Gets the bisZeit value for this EinplanungType.
     *
     * @return bisZeit   * entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein
     */
    public String getBisZeit() {
        return bisZeit;
    }

    /**
     * Sets the bisZeit value for this EinplanungType.
     *
     * @param bisZeit   * entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit
     * (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert
     * sein
     */
    public void setBisZeit(String bisZeit) {
        this.bisZeit = bisZeit;
    }

    /**
     * Gets the projektId value for this EinplanungType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this EinplanungType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EinplanungType)) return false;
        EinplanungType other = (EinplanungType) obj;
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
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.anzahlStunden == null && other.getAnzahlStunden() == null) ||
                        (this.anzahlStunden != null &&
                                this.anzahlStunden.equals(other.getAnzahlStunden()))) &&
                ((this.prozentDerVerfuegbarkeit == null && other.getProzentDerVerfuegbarkeit() == null) ||
                        (this.prozentDerVerfuegbarkeit != null &&
                                this.prozentDerVerfuegbarkeit.equals(other.getProzentDerVerfuegbarkeit()))) &&
                ((this.vonZeit == null && other.getVonZeit() == null) ||
                        (this.vonZeit != null &&
                                this.vonZeit.equals(other.getVonZeit()))) &&
                ((this.bisZeit == null && other.getBisZeit() == null) ||
                        (this.bisZeit != null &&
                                this.bisZeit.equals(other.getBisZeit()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId())));
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
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getAnzahlStunden() != null) {
            _hashCode += getAnzahlStunden().hashCode();
        }
        if (getProzentDerVerfuegbarkeit() != null) {
            _hashCode += getProzentDerVerfuegbarkeit().hashCode();
        }
        if (getVonZeit() != null) {
            _hashCode += getVonZeit().hashCode();
        }
        if (getBisZeit() != null) {
            _hashCode += getBisZeit().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

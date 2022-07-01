/**
 * InternersatzType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Definiert einen internen Satz. i.e. Stunden- oder Tagessatz.
 */
public class InternersatzType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(InternersatzType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "InternersatzType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("satz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "satz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("satztype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "satztype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

    /* Id des internen Stundensatzes. Muss bei der Bearbeitung angegeben
     * werden. */
    private Integer id;
    /* Optional, wird nur beim Lesen zurueck gegeben. */
    private String userId;
    /* Der Satz, zu dem der Mitarbeiter intern verrechnet wird. */
    private Double satz;
    /* Typ des 'internen Satzes': 1=Stundensatz, 2=Tagessatz (nur
     * bei Freelancer) */
    private Integer satztype;
    /* Das Datum, ab dem der interne Satz gilt. */
    private String startdatum;
    /* Bemerkung zum Satz. */
    private String bemerkung;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public InternersatzType() {
    }


    public InternersatzType(
            Integer id,
            String userId,
            Double satz,
            Integer satztype,
            String startdatum,
            String bemerkung) {
        this.id = id;
        this.userId = userId;
        this.satz = satz;
        this.satztype = satztype;
        this.startdatum = startdatum;
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
     * Gets the id value for this InternersatzType.
     *
     * @return id   * Id des internen Stundensatzes. Muss bei der Bearbeitung angegeben
     * werden.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this InternersatzType.
     *
     * @param id   * Id des internen Stundensatzes. Muss bei der Bearbeitung angegeben
     * werden.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the userId value for this InternersatzType.
     *
     * @return userId   * Optional, wird nur beim Lesen zurueck gegeben.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this InternersatzType.
     *
     * @param userId   * Optional, wird nur beim Lesen zurueck gegeben.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the satz value for this InternersatzType.
     *
     * @return satz   * Der Satz, zu dem der Mitarbeiter intern verrechnet wird.
     */
    public Double getSatz() {
        return satz;
    }

    /**
     * Sets the satz value for this InternersatzType.
     *
     * @param satz   * Der Satz, zu dem der Mitarbeiter intern verrechnet wird.
     */
    public void setSatz(Double satz) {
        this.satz = satz;
    }

    /**
     * Gets the satztype value for this InternersatzType.
     *
     * @return satztype   * Typ des 'internen Satzes': 1=Stundensatz, 2=Tagessatz (nur
     * bei Freelancer)
     */
    public Integer getSatztype() {
        return satztype;
    }

    /**
     * Sets the satztype value for this InternersatzType.
     *
     * @param satztype   * Typ des 'internen Satzes': 1=Stundensatz, 2=Tagessatz (nur
     * bei Freelancer)
     */
    public void setSatztype(Integer satztype) {
        this.satztype = satztype;
    }

    /**
     * Gets the startdatum value for this InternersatzType.
     *
     * @return startdatum   * Das Datum, ab dem der interne Satz gilt.
     */
    public String getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the startdatum value for this InternersatzType.
     *
     * @param startdatum   * Das Datum, ab dem der interne Satz gilt.
     */
    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    /**
     * Gets the bemerkung value for this InternersatzType.
     *
     * @return bemerkung   * Bemerkung zum Satz.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this InternersatzType.
     *
     * @param bemerkung   * Bemerkung zum Satz.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InternersatzType)) return false;
        InternersatzType other = (InternersatzType) obj;
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
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.satz == null && other.getSatz() == null) ||
                        (this.satz != null &&
                                this.satz.equals(other.getSatz()))) &&
                ((this.satztype == null && other.getSatztype() == null) ||
                        (this.satztype != null &&
                                this.satztype.equals(other.getSatztype()))) &&
                ((this.startdatum == null && other.getStartdatum() == null) ||
                        (this.startdatum != null &&
                                this.startdatum.equals(other.getStartdatum()))) &&
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getSatz() != null) {
            _hashCode += getSatz().hashCode();
        }
        if (getSatztype() != null) {
            _hashCode += getSatztype().hashCode();
        }
        if (getStartdatum() != null) {
            _hashCode += getStartdatum().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

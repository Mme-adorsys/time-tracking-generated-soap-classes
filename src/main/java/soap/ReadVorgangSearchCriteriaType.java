/**
 * ReadVorgangSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Suchkriterien zur Abfrage von Vorgängen.
 */
public class ReadVorgangSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadVorgangSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadVorgangSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endeDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endeDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("projektId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String projektNr;
    private Integer id;
    private String vorgangNr;
    /* bitte mit 0 belegen falls nach Vorgaenge ohne Parents gesucht
     * wird. */
    private Integer parentId;
    /* VorgangNr des übergeordneten Vorgang. Bitte mit 0 belegen falls
     * nach Vorgaenge ohne Parents gesucht wird. */
    private String parent;
    private String startDatum;
    private String endeDatum;
    private String[] statusListe;
    private Integer projektId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadVorgangSearchCriteriaType() {
    }


    public ReadVorgangSearchCriteriaType(
            String projektNr,
            Integer id,
            String vorgangNr,
            Integer parentId,
            String parent,
            String startDatum,
            String endeDatum,
            String[] statusListe,
            Integer projektId) {
        this.projektNr = projektNr;
        this.id = id;
        this.vorgangNr = vorgangNr;
        this.parentId = parentId;
        this.parent = parent;
        this.startDatum = startDatum;
        this.endeDatum = endeDatum;
        this.statusListe = statusListe;
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
     * Gets the projektNr value for this ReadVorgangSearchCriteriaType.
     *
     * @return projektNr
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ReadVorgangSearchCriteriaType.
     *
     * @param projektNr
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the id value for this ReadVorgangSearchCriteriaType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ReadVorgangSearchCriteriaType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the vorgangNr value for this ReadVorgangSearchCriteriaType.
     *
     * @return vorgangNr
     */
    public String getVorgangNr() {
        return vorgangNr;
    }

    /**
     * Sets the vorgangNr value for this ReadVorgangSearchCriteriaType.
     *
     * @param vorgangNr
     */
    public void setVorgangNr(String vorgangNr) {
        this.vorgangNr = vorgangNr;
    }

    /**
     * Gets the parentId value for this ReadVorgangSearchCriteriaType.
     *
     * @return parentId   * bitte mit 0 belegen falls nach Vorgaenge ohne Parents gesucht
     * wird.
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Sets the parentId value for this ReadVorgangSearchCriteriaType.
     *
     * @param parentId   * bitte mit 0 belegen falls nach Vorgaenge ohne Parents gesucht
     * wird.
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets the parent value for this ReadVorgangSearchCriteriaType.
     *
     * @return parent   * VorgangNr des übergeordneten Vorgang. Bitte mit 0 belegen falls
     * nach Vorgaenge ohne Parents gesucht wird.
     */
    public String getParent() {
        return parent;
    }

    /**
     * Sets the parent value for this ReadVorgangSearchCriteriaType.
     *
     * @param parent   * VorgangNr des übergeordneten Vorgang. Bitte mit 0 belegen falls
     * nach Vorgaenge ohne Parents gesucht wird.
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * Gets the startDatum value for this ReadVorgangSearchCriteriaType.
     *
     * @return startDatum
     */
    public String getStartDatum() {
        return startDatum;
    }

    /**
     * Sets the startDatum value for this ReadVorgangSearchCriteriaType.
     *
     * @param startDatum
     */
    public void setStartDatum(String startDatum) {
        this.startDatum = startDatum;
    }

    /**
     * Gets the endeDatum value for this ReadVorgangSearchCriteriaType.
     *
     * @return endeDatum
     */
    public String getEndeDatum() {
        return endeDatum;
    }

    /**
     * Sets the endeDatum value for this ReadVorgangSearchCriteriaType.
     *
     * @param endeDatum
     */
    public void setEndeDatum(String endeDatum) {
        this.endeDatum = endeDatum;
    }

    /**
     * Gets the statusListe value for this ReadVorgangSearchCriteriaType.
     *
     * @return statusListe
     */
    public String[] getStatusListe() {
        return statusListe;
    }

    /**
     * Sets the statusListe value for this ReadVorgangSearchCriteriaType.
     *
     * @param statusListe
     */
    public void setStatusListe(String[] statusListe) {
        this.statusListe = statusListe;
    }

    /**
     * Gets the projektId value for this ReadVorgangSearchCriteriaType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this ReadVorgangSearchCriteriaType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadVorgangSearchCriteriaType)) return false;
        ReadVorgangSearchCriteriaType other = (ReadVorgangSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.vorgangNr == null && other.getVorgangNr() == null) ||
                        (this.vorgangNr != null &&
                                this.vorgangNr.equals(other.getVorgangNr()))) &&
                ((this.parentId == null && other.getParentId() == null) ||
                        (this.parentId != null &&
                                this.parentId.equals(other.getParentId()))) &&
                ((this.parent == null && other.getParent() == null) ||
                        (this.parent != null &&
                                this.parent.equals(other.getParent()))) &&
                ((this.startDatum == null && other.getStartDatum() == null) ||
                        (this.startDatum != null &&
                                this.startDatum.equals(other.getStartDatum()))) &&
                ((this.endeDatum == null && other.getEndeDatum() == null) ||
                        (this.endeDatum != null &&
                                this.endeDatum.equals(other.getEndeDatum()))) &&
                ((this.statusListe == null && other.getStatusListe() == null) ||
                        (this.statusListe != null &&
                                java.util.Arrays.equals(this.statusListe, other.getStatusListe()))) &&
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
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getVorgangNr() != null) {
            _hashCode += getVorgangNr().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getStartDatum() != null) {
            _hashCode += getStartDatum().hashCode();
        }
        if (getEndeDatum() != null) {
            _hashCode += getEndeDatum().hashCode();
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
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizards.operations.icontrol.data;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hildebj
 */
@Entity
@Table(name = "pool")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Pool.findAll", query = "SELECT p FROM Pool p"),
  @NamedQuery(name = "Pool.findByName", query = "SELECT p FROM Pool p WHERE p.name = :name"),
  @NamedQuery(name = "Pool.findByDescription", query = "SELECT p FROM Pool p WHERE p.description = :description"),
  @NamedQuery(name = "Pool.findById", query = "SELECT p FROM Pool p WHERE p.id = :id")})
public class Pool implements Serializable {
  private static final long serialVersionUID = 1L;
  @Size(max = 2147483647)
  @Column(name = "name")
  private String name;
  @Size(max = 2147483647)
  @Column(name = "description")
  private String description;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @ManyToMany(mappedBy = "poolCollection")
  private Collection<Manager> managerCollection;

  public Pool() {
  }

  public Pool(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @XmlTransient
  public Collection<Manager> getManagerCollection() {
    return managerCollection;
  }

  public void setManagerCollection(Collection<Manager> managerCollection) {
    this.managerCollection = managerCollection;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Pool)) {
      return false;
    }
    Pool other = (Pool) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.wizards.operations.icontrol.data.Pool[ id=" + id + " ]";
  }
  
}

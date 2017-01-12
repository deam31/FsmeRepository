package deam.fsme.domain;
// Generated 12-Jan-2017 12:34:37 by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ingrediente generated by hbm2java
 */
@Entity
@Table(name="ingrediente"
    ,catalog="db_fsme"
)
public class Ingrediente  implements java.io.Serializable {


     private Integer idIngrediente;
     private UnidadDeMedida unidadDeMedida;
     private String nombre;
     private Set<IngredienteDeReceta> ingredienteDeRecetas = new HashSet<IngredienteDeReceta>(0);

    public Ingrediente() {
    }

	
    public Ingrediente(UnidadDeMedida unidadDeMedida, String nombre) {
        this.unidadDeMedida = unidadDeMedida;
        this.nombre = nombre;
    }
    public Ingrediente(UnidadDeMedida unidadDeMedida, String nombre, Set<IngredienteDeReceta> ingredienteDeRecetas) {
       this.unidadDeMedida = unidadDeMedida;
       this.nombre = nombre;
       this.ingredienteDeRecetas = ingredienteDeRecetas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_ingrediente", unique=true, nullable=false)
    public Integer getIdIngrediente() {
        return this.idIngrediente;
    }
    
    public void setIdIngrediente(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_unidad_medida", nullable=false)
    public UnidadDeMedida getUnidadDeMedida() {
        return this.unidadDeMedida;
    }
    
    public void setUnidadDeMedida(UnidadDeMedida unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }
    
    @Column(name="nombre", nullable=false)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ingrediente")
    public Set<IngredienteDeReceta> getIngredienteDeRecetas() {
        return this.ingredienteDeRecetas;
    }
    
    public void setIngredienteDeRecetas(Set<IngredienteDeReceta> ingredienteDeRecetas) {
        this.ingredienteDeRecetas = ingredienteDeRecetas;
    }




}


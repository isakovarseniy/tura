package org.tura.jpa.test;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "File")
@Table(name = "FILE")
public class File {
    @Id
    @Column(name = "OBJID")
    private Long objId;
    @Column(name = "FILENAME")
    private String fileName;
    @OneToMany(mappedBy = "file")
    private Collection<File> file;
    @JoinColumns({@JoinColumn(name = "parentId")
    })
    @ManyToOne
    private File fileDetail;
    @JoinColumns({@JoinColumn(name = "personId")
    })
    @OneToOne
    private Person person;

    public void setObjId(Long objId) {
        this.objId = objId;
    }

    public Long getObjId() {
        return objId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public Collection<File> getFile() {
        return file;
    }

    public void setFile(Collection<File> file) {
        this.file = file;
    }

    public File getFileDetail() {
        return fileDetail;
    }

    public void setFileDetail(File fileDetail) {
        this.fileDetail = fileDetail;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

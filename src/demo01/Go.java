package demo01;

import java.util.Date;

public class Go {
    private Person person;
    private Xingxing target;//目标
    private Date goTime;
    private Boolean end;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Xingxing getTarget() {
        return target;
    }

    public void setTarget(Xingxing target) {
        this.target = target;
    }

    public Date getGoTime() {
        return goTime;
    }

    public void setGoTime(Date goTime) {
        this.goTime = goTime;
    }

    public Boolean getEnd() {
        return end;
    }

    public void setEnd(Boolean end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Go{" +
                "person=" + person +
                ", target=" + target +
                ", goTime=" + goTime +
                ", end=" + end +
                '}';
    }
}

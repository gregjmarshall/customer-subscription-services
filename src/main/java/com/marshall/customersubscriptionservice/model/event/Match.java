package com.marshall.customersubscriptionservice.model.event;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "match_event")
public class Match {

    @Id
    @Column(name = "match_id")
    private Long matchId;
    private Long tournamentId;
    private Date startDate;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "player_a_id")
    private Player playerA;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "player_b_id")
    private Player playerB;

    public Match() {
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Long tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }
}
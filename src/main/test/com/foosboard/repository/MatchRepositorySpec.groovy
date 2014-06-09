import com.foosboard.Application
import com.foosboard.configuration.FongoConfig
import com.foosboard.domain.Match
import com.foosboard.domain.Player
import com.foosboard.repository.MatchRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = [FongoConfig, Application])
class MatchRepositorySpec extends Specification {

    @Autowired
    MatchRepository sut

    @Autowired
    MongoTemplate mongoTemplate

    def "save"() {
        given: "A match"
            def player1 = new Player("Sonni")
            def player2 = new Player("Alf")

            mongoTemplate.save(player1)
            mongoTemplate.save(player2)

            def match = new Match([player1, player2])

        when: "Saving a match to mongo"
            sut.save(match)


        then: "the match is saved"
            mongoTemplate.findAll(Match.class).size()  == 1
    }

}
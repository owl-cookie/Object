package chap01import spock.lang.Specificationclass TicketOfficeSpecification extends Specification {    def "theater 입장 test"() {        given:        def audience = new Audience(new Bag(0, new Invitation()))        def ticketOffice = Mock(TicketOffice)        def seller = Mock(TicketSeller)        def theater = new Theater(seller)        when:        theater.enter(audience)        then:        seller.getTicketOffice() >> ticketOffice        ticketOffice.getTicket() >> new Ticket()        audience.getBag()    }    def "초대권을 갖고 있는 사람"(){        given:        def audience = new Audience(new Bag(0, new Invitation()))        def seller = Mock(TicketSeller)        def theater = new Theater(seller)        when:        theater.enter(audience)        then:        1 * seller.sellTo(audience)    }}
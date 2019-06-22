package com.sda.exercises.terminal;

public class TerminalServiceTest {



        @Before
                public void setUp(){
            TerminalService terminalService = new TerminalService();
            int number = 5;
        }

        @Test
        public void createLineTest() {

        String returned = this.terminalService.createLine(this.number);
        String expected = "*****";
        Assert.assertEquals(returned, expected);

        @After
                public void after() {
                System.out.println("Dziękuję za testy");
            }
    }
}

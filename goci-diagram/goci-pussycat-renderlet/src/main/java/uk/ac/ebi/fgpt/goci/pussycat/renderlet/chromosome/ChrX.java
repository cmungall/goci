package uk.ac.ebi.fgpt.goci.pussycat.renderlet.chromosome;

import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: dwelter
 * Date: 01/03/12
 * Time: 10:48
 * To change this template use File | Settings | File Templates.
 */
public class ChrX extends ChromosomeRenderlet{

    @Override
    protected URL getSVGFile() {
        return getClass().getClassLoader().getResource("chromosomes/X.svg");

    }

    public String getName() {
        return "Chromosome X";
    }
}
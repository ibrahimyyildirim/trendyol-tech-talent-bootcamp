package trendyolBootcampTestHw;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class uniqueWordsTests {

    @Test
    public void getOutPut_WhenWordsContainUpperAndLowerCaseLetters_ShouldReturnNumberOfUniqueWords() {
        //Arrange
        uniqueWords sut = new uniqueWords();

        //Act
        int result = sut.wordCount("BootCamp or Bootcamp OR BOOTCAMP oR bootCAMP");

        //Assert
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void getOutput_WhenWordsSpecialCharactersInThem_ShouldReturnNumberOfUniqueWords(){
        //Arrange
        uniqueWords sut = new uniqueWords();

        //Act
        int result = sut.wordCount("tr-endy.ol tec'h talent boo'tcamp");

        //Assert
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void getOutput_WhenWordsAreUnique_ShouldReturnNumberOfUniqueWords(){
        //Arrange
        uniqueWords sut = new uniqueWords();

        //Act
        int result = sut.wordCount("trendyol tech talent bootcamp");

        //Assert
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void getOutput_WhenWordsAreDuplicate_ShoudReturnNumberOfUniqueWords(){
        //Arrange
        uniqueWords sut = new uniqueWords();

        //Act
        int result = sut.wordCount("trendyol tech talent bootcamp is trendyol tech talent bootcamp");

        //Assert
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void getOutput_WhenWordIsWhitespace_ShouldReturnNumberOfUniqueWords(){
        //Arrange
        uniqueWords sut = new uniqueWords();

        //Act
        int result = sut.wordCount(" ");

        //Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void getOutPut_WhenWordIsEmpty_ShouldReturnNumberOfUniqueWords() {
        //Arrange
        uniqueWords sut = new uniqueWords();

        //Act
        int result = sut.wordCount("");

        //Assert
        assertThat(result).isEqualTo(0);
    }

}

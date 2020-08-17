package year_2020.semester_b.period_a.solution.question_1;

public class Question1 {

	public static void main(String[] args) {
		SurfBoard sb1 = new SurfBoard("Black", 6.0f, SurfBoard.BoardType.Fish);
		SurfBoard sb2 = new SurfBoard("White", 6.8f, SurfBoard.BoardType.Fun);
		SurfBoard sb3 = new SurfBoard("Pink", 5.6f, SurfBoard.BoardType.Hybrid);
		SurfBoard sb4 = new SurfBoard("Yellow", 5.4f, SurfBoard.BoardType.ShortBoard);
		SurfBoard sb5 = new SurfBoard("Red", 5.4f, SurfBoard.BoardType.ShortBoard);
		SurfBoard sb6 = new SurfBoard("Blue", 5.4f, SurfBoard.BoardType.ShortBoard);
		
		Surfer s1 = new Surfer("Kelly Slater", "US", 8);
		Surfer s2 = new Surfer("Kolohe Andino", "US", 4);
		Surfer s3 = new Surfer("Italo Ferreira", "US", 1);
		
		s1.addSurfBoard(sb1);
		s1.addSurfBoard(sb2);
		
		s2.addSurfBoard(sb3);
		s2.addSurfBoard(sb4);
		
		s3.addSurfBoard(sb5);
		s3.addSurfBoard(sb6);
		
		WSL wsl = new WSL("Bells Beach, Melborne, Australia");
		
		wsl.addSurfer(s1);
		wsl.addSurfer(s2);
		wsl.addSurfer(s3);
		
		System.out.println(wsl.toString());
		
		System.out.println("====================================");
		Surfer surferBySerialNumber = wsl.findSurferByBoardSerialNumber(1005);
		System.out.println("The surfer with surfboard with the serial number 1005:");
		System.out.println(
			surferBySerialNumber != null ? surferBySerialNumber.getName() : "-");
		
		System.out.println("====================================");
		surferBySerialNumber = wsl.findSurferByBoardSerialNumber(1200);
		System.out.println("The surfer with surfboard with the serial number 1200:");
		System.out.println(
			surferBySerialNumber != null ? surferBySerialNumber.getName() : "-");
		
		System.out.println("====================================");
		Surfer surfer = wsl.findSurferWithLongestSurfBoard();
		System.out.println("The surfer who has the longest surfboard is:");
		System.out.println(surfer.getName());
		
		System.out.println("====================================");
		SurfBoard.BoardType boardType = wsl.findTheMostUsedBoardType();
		System.out.println("The most used board type is " + boardType.toString());
	}
}

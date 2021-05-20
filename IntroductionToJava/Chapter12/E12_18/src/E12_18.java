import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.util.Scanner;

public class E12_18 {

	public static void main(String args[]) throws Exception {
		
		if (args.length != 1) {
			System.out.println("Usage java E12_18 srcRootDirectory");
			System.exit(1);
		}

		File rootDir = new File(args[0]);

		if (!rootDir.exists()) {
			System.out.println("Root directory not found!");
			System.exit(2);
		}

		File[] chapterList = rootDir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.startsWith("chapter")) {
					return true;
				}

				return false;
			}

		});

		for (File f : chapterList) {
			if (f.isDirectory()) {
				File[] fileList = f.listFiles(new FilenameFilter() {
					public boolean accept(File dir, String name) {
						if (name.endsWith(".java")) {
							return true;
						}

						return false;
					}
				});

				for (File src : fileList) {
					String s = "";

					try (Scanner input = new Scanner(src)) {

						while (input.hasNext()) {
							s += input.nextLine() + "\n";
						}

						StringBuilder sBuilder = new StringBuilder(s);
						sBuilder.insert(0, "package " + f.getName() + ";\n");
						s = sBuilder.toString();
					}

					try (PrintWriter srcOutput = new PrintWriter(src)) {
						srcOutput.print(s);
					}
				}
			}
		}

	}
}

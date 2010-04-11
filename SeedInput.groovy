import java.io.*

class SeedInput{
	static void main(String[] args){
		File f = new File("input.txt")
		100.times{
			f.append("${it}. This is a test\n")
		}
		
		File f2 = new File("input2.txt")
		f.withWriterAppend{ writer ->
			100.times{
				writer << "${it}"
			}
		}
	}
}

/*def s = new SeedInput()
s.seed()

File f = new File("input.txt")
100.times{
	file.append(${it} + ". This is a test\n")
}*/
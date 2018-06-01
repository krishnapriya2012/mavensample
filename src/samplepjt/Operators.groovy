package samplepjt

class Operators {
public static void main(String []args)
{
	println 'Groovy' ==~ 'Groovy'
	println 'Groovy' ==~ 'o'
	println 'Groovy' ==~ 'Groovy'
	println 'Groovy' ==~ 'oo'
	println 'Groovy' ==~ '$G'
	println 'GGGGG' ==~ 'G*'
	println 'Grroovy' ==~ 'G$' 
	println 'Groovy' ==~ 'Gro{2}vy'
}

}

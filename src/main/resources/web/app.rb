require 'rubygems'
require 'sinatra'

get '/' do
  erb :index
end

post '/parse' do

  puts 'parsing'

  # invoke the parser with the given input
  output = ''
  IO.popen("java -jar parser.jar '#{params[:value]}'") do |parser|
    parser.each{|line| output << line} 
  end
  output = "{\"errors\":\"#{output.strip()}\"}" if (("{" =~ /^\{/) == 0)

  content_type :json
  output
end
